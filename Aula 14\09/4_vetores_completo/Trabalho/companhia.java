import java.util.Scanner;

public class companhia {

    private String nome;
    private float cnpj;
    private String pais;
    private float telefone;
    private String email;
    private String endereco;
    private int Qntdvoos;
    private voo[] vetVoos;


    // construtor da companhia
    public companhia() {
        this.vetVoos = new voo[10];
        this.Qntdvoos = 0;
    }


    // metodo para cadastrar um voo
    public void cadastrarVoo(Scanner teclado) {

    // Cria um novo voo
    voo novoVoo = new voo();

    // Cadastro dos dados do voo
    System.out.print("Digite o ID do voo: ");
    novoVoo.setId(teclado.nextFloat());

    teclado.nextLine();

    System.out.print("Digite a origem: ");
    novoVoo.setOrigem(teclado.nextLine());

    System.out.print("Digite o destino: ");
    novoVoo.setDestino(teclado.nextLine());

    System.out.print("Digite a hora de saida: ");
    novoVoo.setHora_saida(teclado.nextFloat());

    System.out.print("Digite a hora de chegada: ");
    novoVoo.setHora_chagada(teclado.nextFloat());

    teclado.nextLine();

    System.out.print("Digite o status do voo: ");
    novoVoo.setStatus(teclado.nextLine());

    System.out.print("Digite o nome dos pilotos: ");
    novoVoo.setPilotos(teclado.nextLine());


    // Pergunta quantos passageiros serão cadastrados
    System.out.print("Quantos passageiros deseja cadastrar? ");
    int quantidade = teclado.nextInt();

    teclado.nextLine();


    // Cadastro dos passageiros
    for (int i = 0; i < quantidade; i++) {

        System.out.println("\n===== PASSAGEIRO " + (i + 1) + " =====");

        // Cria um novo passageiro
        passageiro novoPassageiro = new passageiro();

        System.out.print("Digite o nome: ");
        novoPassageiro.setNome(teclado.nextLine());

        System.out.print("Digite o passaporte: ");
        novoPassageiro.setPassaporte(teclado.nextLine());

        System.out.print("Digite a data de nascimento: ");
        novoPassageiro.setDatansc(teclado.nextFloat());

        System.out.print("Digite o CPF: ");
        novoPassageiro.setCPF(teclado.nextFloat());

        System.out.print("Digite o contato: ");
        novoPassageiro.setContato(teclado.nextFloat());

        teclado.nextLine();

        // Adiciona o passageiro ao voo
        novoVoo.setpassageiro(novoPassageiro);
    }


    // Adiciona o voo à companhia
    setVetVoos(novoVoo);

    System.out.println("\nVoo cadastrado com sucesso!");
    }


    // adiciona um voo no vetor
    public void setVetVoos(voo a) {
        if (this.Qntdvoos < 10) {
            this.vetVoos[Qntdvoos] = a;
            Qntdvoos++;
        }
    }

    // Retorna um voo de determinada posição
    public voo getVoo(int pos) {
        return this.vetVoos[pos];
    }

    public int getQntdvoos() {
        return Qntdvoos;
    }


    public void setQntdvoos(int qntdvoos) {
        Qntdvoos = qntdvoos;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public float getCnpj() {
        return cnpj;
    }


    public void setCnpj(float cnpj) {
        this.cnpj = cnpj;
    }


    public String getPais() {
        return pais;
    }


    public void setPais(String pais) {
        this.pais = pais;
    }


    public float getTelefone() {
        return telefone;
    }


    public void setTelefone(float telefone) {
        this.telefone = telefone;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
