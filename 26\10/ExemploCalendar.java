import java.sql.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploCalendar {

    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println("Agora: " + agora);

        Calendar dtVencimento = agora;
        dtVencimento.add(Calendar.DATE, 7);
        System.out.println("Data de Vencimento: " + dtVencimento);
        dtVencimento.add(Calendar.MONTH, -1);
        System.out.println("Nova data de Vencimento: " + dtVencimento);

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Ano: " + gc.get(Calendar.YEAR));
        System.out.println("Mês: " + gc.get(Calendar.MONTH));
        System.out.println("Dia do mês: " + gc.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia da Semana: " + gc.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do Ano: " + gc.get(Calendar.DAY_OF_YEAR));
        System.out.println("Semana do mês: " + gc.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Dia da semana no mês: " + gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Hora: " + gc.get(Calendar.HOUR));
        System.out.println("AM/PM: " + gc.get(Calendar.AM_PM));
        System.out.println("Hora do dia (24h): " + gc.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minuto: " + gc.get(Calendar.MINUTE));
        System.out.println("Segundo: " + gc.get(Calendar.SECOND));

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data abreviada: " + df.format(gc.getTime()));
        System.out.println("Vencimento: " + dtVencimento.getTime());
        System.out.println("Vencimento formatado: " + df.format(dtVencimento.getTime()));
    }
    
}
