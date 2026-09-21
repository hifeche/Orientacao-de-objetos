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

    if (quantidade > 50) {
        System.out.println("O voo pode ter no maximo 50 passageiros.");
        quantidade = 50;
    }
    
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

    // Lista todos os voos cadastrados
    public void listarVoos() {

    if (Qntdvoos == 0) {
        System.out.println("Nenhum voo cadastrado.");
    } else {

        System.out.println("\n===== VOOS CADASTRADOS =====");

        for (int i = 0; i < Qntdvoos; i++) {

            voo v = vetVoos[i];

                System.out.println("\nVoo " + (i + 1));
                System.out.println("ID: " + v.getId());
                System.out.println("Origem: " + v.getOrigem());
                System.out.println("Destino: " + v.getDestino());
                System.out.println("Hora de saida: " + v.getHora_saida());
                System.out.println("Hora de chegada: " + v.getHora_chagada());
                System.out.println("Status: " + v.getStatus());
                System.out.println("Pilotos: " + v.getPilotos());
            }
        }
    }

    // Consulta um determinado voo
    public void consultarVoo(Scanner teclado) {

    // Verifica se existe algum voo cadastrado
    if (Qntdvoos == 0) {

        System.out.println("Nenhum voo cadastrado.");

    } else {

        // Pede o ID do voo que será consultado
        System.out.print("Digite o ID do voo: ");
        float idConsulta = teclado.nextFloat();

        // Começamos considerando que o voo não foi encontrado
        boolean encontrado = false;

        // Percorre os voos cadastrados
        for (int i = 0; i < Qntdvoos; i++) {

            // Pega o voo da posição atual
            voo v = vetVoos[i];

            // Verifica se o ID do voo é igual ao ID digitado
            if (v.getId() == idConsulta) {

                encontrado = true;

                // Mostra os dados do voo
                System.out.println("\n===== DADOS DO VOO =====");
                System.out.println("ID: " + v.getId());
                System.out.println("Origem: " + v.getOrigem());
                System.out.println("Destino: " + v.getDestino());
                System.out.println("Hora de saida: " + v.getHora_saida());
                System.out.println("Hora de chegada: " + v.getHora_chagada());
                System.out.println("Status: " + v.getStatus());
                System.out.println("Pilotos: " + v.getPilotos());

                // Mostra os passageiros
                System.out.println("\n===== PASSAGEIROS =====");

                for (int j = 0; j < v.getQntdpass(); j++) {

                    // Pega o passageiro da posição atual
                    passageiro p = v.getpassageiro(j);

                    System.out.println("\nPassageiro " + (j + 1));
                    System.out.println("Nome: " + p.getNome());
                    System.out.println("Passaporte: " + p.getPassaporte());
                    System.out.println("Data de nascimento: " + p.getDatansc());
                    System.out.println("CPF: " + p.getCPF());
                    System.out.println("Contato: " + p.getContato());
                }

                // Calcula os assentos livres
                int assentosLivres = 50 - v.getQntdpass();

                System.out.println("\nAssentos livres: " + assentosLivres);

                // Para o laço porque encontramos o voo
                break;
            }
        }

            // Caso nenhum voo tenha o ID informado
            if (encontrado == false) {
                System.out.println("Voo nao encontrado.");
            }
        }
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
