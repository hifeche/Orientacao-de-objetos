public class Circulo implements FormaGeometrica{
    private float raio;
    
    public float getRaio(){
        return raio;
    }

    public void setRaio(float raio){
        if (raio > 0) {
            this.raio = raio;
        }
    }

    @Override 
    public float calcularArea(){
        System.out.println("Raio do círculo: " + raio);
        return (float) (3.14 * raio * raio);
    }
}
