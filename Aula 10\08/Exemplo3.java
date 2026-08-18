public class Exemplo3{
	public static void main(String args[]){
		String cliente = "Humberto";
		
		Pet pet1 = new Pet();//instancia um objeto da classe Pet 
		pet1.especie = "gato";
		pet1.nome = "Calvin";
		pet1.idade = 14;
		
		System.out.println("O nome do cliente é " + cliente
			+ ", e possui um pet chamado " + pet1.nome
			+ " que é " + pet1.especie + " e tem "
			+ pet1.idade + " anos.");
		
	}
}
