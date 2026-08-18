public class ExemploInteger{
	public static void main (String args[]) {
		String s1 = "10";
		System.out.println("s1 = " + s1);
		
		//converter de Strinf para int
		int i1 = Integer.parseInt(s1);
		System.out.println("i1 = " + i1);
		
		//converte de Integer/int para String
		Integer i2 = 5;
		s1 = Integer.toString(i2);
		int x = 2;
		//s1 = x.toString(); // não funciona pois é int (tipo
		s1 = Integer.toString(x);
		
		//converter de Integer para float
		float f1 = i2.floatValue()/ 3;
		System.out.println("f1 = " + f1);
		System.out.println("f1 = " +
			String.format("%.02f", f1));
		//float f2 = Intefer.floatValue(x)/ 5;
		//System.out.println("f2 = " + f2);
		
		//comparação
		Integer i3 = 3;
		int i4 = 3;
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		
	}
}

