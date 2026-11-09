import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrecoVenda {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Margem de lucro (em %)
        double margem;
        while (true) {
            System.out.print("Margem de lucro (%): ");
            try {
                margem = Double.parseDouble(teclado.nextLine().trim().replace(",", "."));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido, digite um numero.");
            }
        }

        // Nomes dos arquivos (Etapa 2) - vazio usa o padrao
        System.out.print("Arquivo de entrada: ");
        String entrada = teclado.nextLine().trim();
        if (entrada.isEmpty()) {
            entrada = "preco_custo.csv";
        }

        System.out.print("Arquivo de saida: ");
        String saida = teclado.nextLine().trim();
        if (saida.isEmpty()) {
            saida = "preco_venda.csv";
        }

        int totalVenda = 0;
        int totalComprar = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(entrada), StandardCharsets.UTF_8));
             BufferedWriter bwVenda = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(saida), StandardCharsets.UTF_8));
             BufferedWriter bwComprar = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("comprar.csv"), StandardCharsets.UTF_8))) {

            // Formato de entrada: codigo;estoque;produto;preco_custo;categoria
            String linha = br.readLine(); // cabecalho
            if (linha == null) {
                System.out.println("Arquivo de entrada vazio.");
                return;
            }
            bwVenda.write("codigo;nome produto;preco de venda");
            bwVenda.newLine();
            bwComprar.write(linha); // mesmo cabecalho da entrada
            bwComprar.newLine();

            while ((linha = br.readLine()) != null) {
                if (linha.trim().isEmpty()) {
                    continue;
                }
                String[] campos = linha.split(";");
                try {
                    String codigo = campos[0].trim();
                    int estoque = Integer.parseInt(campos[1].trim());
                    String nome = campos[2].trim();
                    double custo = Double.parseDouble(campos[3].trim().replace(",", "."));

                    double precoVenda = custo * (1 + margem / 100);
                    String precoTxt = String.format("%.2f", precoVenda).replace(".", ",");

                    bwVenda.write(codigo + ";" + nome + ";" + precoTxt);
                    bwVenda.newLine();
                    totalVenda++;

                    if (estoque < 10) {
                        bwComprar.write(linha);
                        bwComprar.newLine();
                        totalComprar++;
                    }
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.out.println("Linha ignorada (formato invalido): " + linha);
                }
            }

            System.out.println("'" + saida + "' gerado com " + totalVenda + " produtos.");
            System.out.println("'comprar.csv' gerado com " + totalComprar + " itens com estoque abaixo de 10.");
            System.out.println("Arquivos salvos em: " + new File(saida).getAbsoluteFile().getParent());

        } catch (IOException e) {
            System.out.println("Erro ao ler/gravar arquivos: " + e.getMessage());
        }
    }
}
