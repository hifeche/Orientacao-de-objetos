public class Exemplo4{
	public static void main(String args[]){
		String cliente = "ERIC";

		Pet pet1 = new Pet(); //instancia um objeto da classe Pet.
		pet1.especie = "gato";
		pet1.nome = "Larry";
		pet1.idade = 4;

		System.out.println("O nome do cliente é " + cliente + ", e possui um pet chamado " + pet1.nome +
		 " que é um " + pet1.especie + " e tem " + pet1.idade + " anos.");
		 
		 Pet pet2 = new Pet();
		 pet2.especie = "cachorro";
		 pet2.nome = "Zeus";
		 pet2.idade = 6;
		 
		 exibirMensagem(cliente, pet2);
	}
	
		public static void exibirMensagem(String cliente, Pet p){
				System.out.println("O nome do cliente é " + cliente + ", e possui um pet chamado " + p.nome +
		 " que é um " + p.especie + " e tem " + p.idade + " anos.");
	}
	
}
