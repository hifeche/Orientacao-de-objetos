public class Exemplo4{
	public static void main(String args[]){
		String cliente = "Humberto";
		
		Pet pet1 = new Pet();//instancia um objeto da classe Pet 
		pet1.especie = "gato";
		pet1.nome = "Calvin";
		pet1.idade = 14;
		
		exibirMensagem(cliente, pet1);
		
		Pet pet2 = new Pet();
		pet2.especie = "papagaio";
		pet2.nome = "Tião";
		pet2.idade = 6;
		
		exibirMensagem(cliente, pet2);
	}
	
	public static void exibirMensagem(String cliente, Pet p){
		System.out.println("O nome do cliente é " + cliente
			+ ", e possui um pet chamado " + p.nome
			+ " que é " + p.especie + " e tem "
			+ p.idade + " anos.");
	}
}
