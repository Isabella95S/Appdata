import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        //String dataString = data.getYear() + "-" + data.getMonth() + "-" + data.getDayOfMonth() + "-" + data.getDayOfWeek() ;
        String formattedDate = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        //Offsetdatatime è un oggetto immutabile
        OffsetDateTime data1 = data.plusYears(1).minusMonths(1).plusDays(7);
        //formetter personalizzato
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", Locale.ITALIAN);

        System.out.println("data:" + formatter.format(data1));
    }
}