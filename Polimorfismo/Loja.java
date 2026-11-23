public class Loja {
    public static void main(String[] args){
        Vendedor v1 = new Vendedor();
        float comissao = v1.calcularComissao(500.90f);
        System.out.println("Comissão da venda 1: R$ " + String.format("%.2", comissao));

        comissao = v1.calcularComissao( 500.9f,  0.15f);
        System.out.println("Comissão da venda 2: R$ " + String.format("%.2f", comissao));
    }
}
