import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
// Creazione dei due oggetti Instant dalle stringhe ISO 8601
        Instant date1 = Instant.parse("2023-03-01T13:00:00Z");
        OffsetDateTime date2 = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime date3 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        //Instant date2 = Instant.parse("2024-03-01T13:00:00Z");

        // Verifica che la prima data è precedente alla seconda
        //boolean isDate1BeforeDate2 = date1.isBefore(date2);

        // Verifica che la seconda data è successiva alla prima
        //boolean isDate2AfterDate1 = date2.isAfter(date1);

        // Verifica che le due date sono uguali
        //boolean areDatesEqual = date1.equals(date2);
        OffsetDateTime nextYear = date2.plusYears(1);

        OffsetDateTime minusMonth = date3.minusMonths(1);
        OffsetDateTime sevenDays = date3.plusDays(7);

        String DateStringNextYear = nextYear.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        String DateStringMinusMonth = minusMonth.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        String DateStringSevenDays = sevenDays.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.ITALY));

        System.out.println("DateStringNextYear " + DateStringNextYear);
        System.out.println("DateStringMinusMonth " + DateStringMinusMonth);
        System.out.println("DateStringSevenDays " + DateStringSevenDays);



        // Stampa i risultati
        //System.out.println("La prima data è precedente alla seconda? " + isDate1BeforeDate2);
       //System.out.println("La seconda data è successiva alla prima? " + isDate2AfterDate1);
       // System.out.println("Le due date sono uguali? " + areDatesEqual);
       // System.out.println("L'anno è: " + getYear(date1));
        //System.out.println("Il mese è: " + getMonth(date1));
        //System.out.println("Il giorno è: " + getDay(date1));
        //System.out.println("Il giorno della settimana è: " + getDayofWeek(date1));
        //System.out.println("date3 " + date3);


    }
    // Metodo per ottenere l'anno da un oggetto Instant
    public static int getYear(Instant date) {
        ZonedDateTime zdt = date.atZone(ZoneId.of("UTC"));
        return zdt.getYear();
    }

    public static int getMonth(Instant date) {
        ZonedDateTime zdt = date.atZone(ZoneId.of("UTC"));
        return zdt.getMonthValue();
    }
    public static int getDay(Instant date) {
        ZonedDateTime zdt = date.atZone(ZoneId.of("UTC"));
        return zdt.getDayOfMonth();
    }
    public static int getDayofWeek(Instant date) {
       ZonedDateTime zdt = date.atZone(ZoneId.of("UTC"));
        return zdt.getDayOfWeek().getValue();
   }
}
