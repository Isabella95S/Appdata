import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataString = data.getYear() + "-" + data.getMonth() + "-" + data.getDayOfMonth() + "-" + data.getDayOfWeek() ;
        //String dataString = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("dataString: " + dataString);
    }
}