public class Quadrado implements FormaGeometrica{
    private float lado;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        if (lado > 0) {
            this.lado = lado;
        }
    }

    @Override 
    public float calcularArea(){
        System.out.println("Lados do Quadrado: " + lado);
        return lado * lado;
    }
    

}
