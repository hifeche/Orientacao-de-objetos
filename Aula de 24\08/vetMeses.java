public class vetMeses {
    String vetMeses[] = new String[12];

    //Método construtor
    //Executa automaticamente sempre que 
    //se instancia um objeto da classe
    public vetMeses(){
        atribuirValor();
    }

    private void atribuirValor(){

        vetMeses[0] = "Janeiro";
        vetMeses[1] = "Fevereiro";
        vetMeses[2] = "Março";
        vetMeses[3] = "Abril";
        vetMeses[4] = "Maio";
        vetMeses[5] = "Junho";
        vetMeses[6] = "Julho";
        vetMeses[7] = "Agosto";
        vetMeses[8] = "Setembro";
        vetMeses[9] = "Outubro";
        vetMeses[10] = "Novembro";
        vetMeses[11] = "Dezembro";
        
    }
 
    public String pegarNomeMes(int num){
        if(num > 0 && num <= 12){
                return vetMeses [num -1];
            }else{
                return "";
            }
    }

}
