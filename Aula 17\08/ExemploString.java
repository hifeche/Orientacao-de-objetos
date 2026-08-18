public class ExemploString{
	public static void main (String args[]) {
		String str1, str2, str3;
		str1 = "Um, texto qualquer .xxx...     ";
		System.out.println("[" + str1 + "]");
		str1 = str1.trim();
		System.out.println("após trim [" + str1 + "]");
		System.out.println("tamanho do str1 = " + str1.length());
		
		//substituir um substring dentro de um String
		str2 = str1.replace("texto", "teste");
		System.out.println("str2[" + str2 + "]");
		str2 = str2.replace(".", "$$");
		System.out.println("str2[" + str2 + "]");
		
		//extrair um substring
		str2 = str1.substring(3, 8);
		System.out.println("str2[" + str2 + "]");
		
		//procurar substring 
		str2 = "joão.silva@gmail.com";
		int posicao = str2.indexOf("@");
		System.out.println(str2 
				+ " - @ está na posição " + posicao);
		System.out.println("Usuário: " 
				+ str2.substring(0, str2.indexOf("@")));
		System.out.println("Domínio: " 
				+ str2.substring(str2.indexOf("@") + 1). toUpperCase());
				
		/*toUppercase() = transformar para maiúsculas
		 *toLowerCase() = transforma para minúsculas
		 */
		 
		//converte de outros tipos para String
		int valor = 5;
		str3 = String.valueOf(valor);
		
		//quebrar um String em vetor
		String valores = "4/6/2/55/22/9";
		String[] arrayValores = valores.split("/");
		System.out.println("arrayValores[3] = " + arrayValores[3]);
		
		//percorra o arrayValores mostrnado todos os valores na tela
		for(int i = 0; i < arrayValores.length; i++){
			System.out.println("arrayValores[" + i + "] = " + arrayValores[i]);
		}
	}
}

