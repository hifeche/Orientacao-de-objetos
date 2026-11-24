public class Calculo {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        System.out.println(c.getRaio());

        Quadrado q = new Quadrado();
        System.out.println(q.getLado());

        Retangulo r = new Retangulo();
        r.setAltura(5);
        r.setBase(8);
        System.out.println("Retangulo");
        System.out.println("Altura " + r.getAltura());
        System.out.println("Base " + r.getBase());
        System.out.println("Área " + r.calcularArea());
    }
           
}
