public class Decisao{
	public static void main(String args[]){

		if(args.length < 2){
			System.out.println("Precisa de 2 parametros");
			System.exit(0);
		}
		int val1 = Integer.parseInt(args[0]);//converte para int
		int val2 = Integer.parseInt(args[1]);
		
		if((val1 < 5) && (val2 != 2)){
			System.out.println("Entrou no if");
		}else if(val2 < 5){
			System.out.println("Entrou em else if");
		}else{
			System.out.println("Entrou em else");
		}
		
		int val = 2;
		switch (val){
			case 1:
			case 2:
				System.out.println("1 ou 2");
				break;
			case 3:
				System.out.println("3");
				break;
			defalt:
			System.out.println("outro valor");
		}
		
		String resp = "s";
		switch (resp.toUpperCase()){
			case "S":
				System.out.println("SIM");
				break;
			case "N":
				System.out.println("NÂO");
				break;
			default:
				System.out.println("outro valor");
		}
		
	}
}
