import java.io.BufferedReader;
import java.io.FileReader;

public class venda {

    BufferedReader leit;

    public static void main(String[] args) throws Exception{
        venda v = new venda();

        String entrada = "vendas.csv";
        v.leit = new BufferedReader(new FileReader(entrada));
        v.lerDados();
        
    }

    public void lerDados()throws Exception{

        String linha;

        int quantidadeVendas = 0;
        double valorTotal = 0;
        double valorVista = 0;
        double valorPrazo = 0;

        leit.readLine();    //ignora o cabeçalho

        while ((linha = leit.readLine()) != null) {

            //String[] dados = linha.split("\\s+");  //separa os campos da linha
            String[] dados = linha.split(";");  //separa os campos quando estão separados por || , || ; || \t ||

            if (dados.length < 4) {
            System.out.println("Linha com formato inválido: " + linha);  //evita que o programa tente acessar posições inexistentes
            continue;
            }

            double valor = Double.parseDouble(dados[2].replace("," , "."));  //converter o valor para double para realizar os cálculos
            String tipoPagamento = dados[3];

            quantidadeVendas++;
            valorTotal += valor;  //acumula o valor das vendas

            if (tipoPagamento.equals("V")) {
                valorVista += valor;
            } else if (tipoPagamento.equals("P")) {
                valorPrazo += valor;
            }
        }

        leit.close();

        //chama o método do segundo arquivo
        mostrarResultados(quantidadeVendas, valorTotal, valorVista, valorPrazo);
    }


    public void mostrarResultados(
        int quantidade,
        double total,
        double vista,
        double prazo)
        {
        //double armazena números com casas decimais com mais precisão que float.

        System.out.println("Quantidade de vendas: " + quantidade);

        System.out.printf("Valor total das vendas: R$ %.2f%n", total);

        System.out.printf("Valor total à vista: R$ %.2f%n", vista);

        System.out.printf("Valor total a prazo: R$ %.2f%n", prazo);
    }
        
}

