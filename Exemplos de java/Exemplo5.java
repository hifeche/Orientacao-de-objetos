public class Exemplo5{
	public static void main(String args[]){
		
		OperacoesMatematicas opMat = new OperacoesMatematicas();
			
		System.out.println("67 * 44 = " + 
		opMat.multi(67, 44));
		
		System.out.println("22 + 8 = "
		 + opMat.somar(22, 8));
		 
		System.out.println("88 - 45 = "
		 + opMat.subtrair(88, 45));
		 
		System.out.println("100 / 50 = "
		 + opMat.dividir(100, 50));
	}
}
