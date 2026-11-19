public class Usuario {
    public static void main(String[] args){
        System.out.println("[Relógio de pulso]");
        RelogiodePulso rp = new RelogiodePulso();
        System.out.println(rp.gethoras());
        System.out.println(rp.iniciarCronometro());

        System.out.println("[Radio Relógio]");
        RadioRelogio rr = new RadioRelogio();
        System.out.println(rr.ligar());
        System.out.println(rr.trocarEstacao(101.9f));
        System.out.println(rr.desligar());
        System.out.println(rr.gethoras());

        //Por padrão não se pode instanciar uma interface
        //a menos que se faça na hora uma implementação
        //dos metodos
        //Recurso de uso ,maios restrito
        RelogioInterface r = new RelogioInterface() {
            public String getHoras(){
                return "um horário qualquer";
            }
        };
    }
}
