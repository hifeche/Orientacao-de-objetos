import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RelogiodePulso implements RelogioInterface{

    @Override //sinaliza a implementação do método da interface
        public String gethoras(){
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter dtf =
            DateTimeFormatter.ofPattern("=== HH:mm:ss ===");
        return horaAtual.format(dtf);
    }

    public String iniciarCronometro(){
        return "Iniciando o cronometro...";
    }
}

