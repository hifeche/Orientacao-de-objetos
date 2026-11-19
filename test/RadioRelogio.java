import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RadioRelogio implements RadioInt, RelogioInterface{
    
        @Override 
        public String ligar(){
            return "Rádio ligado";
        }

        @Override 
        public String desligar(){
            return "Rádio desligado";
        }

        @Override 
        public String trocarEstacao(float estacao){
            return "Troncando estação para " + estacao;
        }
        
        @Override //sinaliza a implementação do método da interface
        public String gethoras(){
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter dtf =
            DateTimeFormatter.ofPattern("=== HH:mm ===");
        return horaAtual.format(dtf);
    }
}
