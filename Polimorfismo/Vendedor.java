public class Vendedor {
    //Sobrecarga de método / Overload

    //Calcula a comissão do vendedor conforme a regra:
    //R$ 20,00 + 5% do valor da venda
    public float calcularComissao(float venda){
        float comissao = (venda * 0.05f) + 20.0f;
        return comissao;
    }

    //Calcula a comissão do vendedor conforme a regra:
    //Percentual variável sobre o valor da venda
    public float calcularComissao(float venda, float perc){
        float comissao = venda * perc;
        return comissao;
    }
}
