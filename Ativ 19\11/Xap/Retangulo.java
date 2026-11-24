public class Retangulo implements FormaGeometrica{
    private float base;
    private float altura;

    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        if (base > 0) {
            this.base = base;
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }
   
    @Override
    public float calcularArea() {
        return base * altura;
    }
}
