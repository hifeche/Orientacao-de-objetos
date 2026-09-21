import java.util.Scanner;

public class companhia {

    private String nome;
private String endereco;
private int Qntdvoos;
private voo[] vetVoos;

    // Construtor da companhia
    public companhia() {
        this.vetVoos = new voo[10];
        this.Qntdvoos = 0;
    }

    // Método para ler números inteiros sem deixar o programa quebrar
    private int lerInteiro(Scanner teclado) {

        while (!teclado.hasNextInt()) {
            System.out.println("Digite apenas numeros inteiros.");
            teclado.next();
            System.out.print("Digite novamente: ");
        }

        return teclado.nextInt();
    }

    // Método para cadastrar um voo
    public void cadastrarVoo(Scanner teclado) {

        voo novoVoo = new voo();

        System.out.print("Digite o ID do voo: ");
        novoVoo.setId(lerInteiro(teclado));

        teclado.nextLine();

        System.out.print("Digite a origem: ");
        novoVoo.setOrigem(teclado.nextLine());

        System.out.print("Digite o destino: ");
        novoVoo.setDestino(teclado.nextLine());

        System.out.print("Digite a hora de saida: ");
        novoVoo.setHora_saida(lerInteiro(teclado));

        System.out.print("Digite a hora de chegada: ");
        novoVoo.setHora_chagada(lerInteiro(teclado));

        teclado.nextLine();

        System.out.print("Digite o status do voo: ");
        novoVoo.setStatus(teclado.nextLine());

        System.out.print("Digite o nome dos pilotos: ");
        novoVoo.setPilotos(teclado.nextLine());

        // Quantidade de passageiros
        System.out.print("Quantos passageiros deseja cadastrar? ");
        int quantidade = lerInteiro(teclado);

        while (quantidade < 0 || quantidade > 50) {

            if (quantidade < 0) {
                System.out.println("A quantidade nao pode ser negativa.");
            } else {
                System.out.println("O voo pode ter no maximo 50 passageiros.");
            }

            System.out.print("Digite novamente: ");
            quantidade = lerInteiro(teclado);
        }

        teclado.nextLine();

        // Cadastro dos passageiros
        for (int i = 0; i < quantidade; i++) {

            System.out.println("\n===== PASSAGEIRO " + (i + 1) + " =====");

            passageiro novoPassageiro = new passageiro();

            System.out.print("Digite o nome: ");
            novoPassageiro.setNome(teclado.nextLine());

            System.out.print("Digite o passaporte: ");
            novoPassageiro.setPassaporte(teclado.nextLine());

            System.out.print("Digite o ano de nascimento: ");
            novoPassageiro.setDatansc(lerInteiro(teclado));

            teclado.nextLine();

            System.out.print("Digite o CPF: ");
            novoPassageiro.setCPF(teclado.nextLine());

            System.out.print("Digite o contato: ");
            novoPassageiro.setContato(teclado.nextLine());

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

        if (Qntdvoos == 0) {

            System.out.println("Nenhum voo cadastrado.");

        } else {

            System.out.print("Digite o ID do voo: ");
            int idConsulta = lerInteiro(teclado);

            boolean encontrado = false;

            for (int i = 0; i < Qntdvoos; i++) {

                voo v = vetVoos[i];

                if (v.getId() == idConsulta) {

                    encontrado = true;

                    System.out.println("\n===== DADOS DO VOO =====");
                    System.out.println("ID: " + v.getId());
                    System.out.println("Origem: " + v.getOrigem());
                    System.out.println("Destino: " + v.getDestino());
                    System.out.println("Hora de saida: " + v.getHora_saida());
                    System.out.println("Hora de chegada: " + v.getHora_chagada());
                    System.out.println("Status: " + v.getStatus());
                    System.out.println("Pilotos: " + v.getPilotos());

                    System.out.println("\n===== PASSAGEIROS =====");

                    for (int j = 0; j < v.getQntdpass(); j++) {

                        passageiro p = v.getpassageiro(j);

                        System.out.println("\nPassageiro " + (j + 1));
                        System.out.println("Nome: " + p.getNome());
                        System.out.println("Passaporte: " + p.getPassaporte());
                        System.out.println("Data de nascimento: " + p.getDatansc());
                        System.out.println("CPF: " + p.getCPF());
                        System.out.println("Contato: " + p.getContato());
                    }

                    int assentosLivres = 50 - v.getQntdpass();

                    System.out.println("\nAssentos livres: " + assentosLivres);

                    break;
                }
            }

            if (encontrado == false) {
                System.out.println("Voo nao encontrado.");
            }
        }
    }

    // Adiciona um voo no vetor
    public void setVetVoos(voo a) {

        if (this.Qntdvoos < 10) {
            this.vetVoos[Qntdvoos] = a;
            Qntdvoos++;
        } else {
            System.out.println("A companhia ja possui 10 voos cadastrados.");
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}