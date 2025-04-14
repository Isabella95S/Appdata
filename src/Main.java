import java.time.Instant;


public class Main {
    public static void main(String[] args) {
// Creazione dei due oggetti Instant dalle stringhe ISO 8601
        Instant date1 = Instant.parse("2023-03-01T13:00:00Z");
        Instant date2 = Instant.parse("2024-03-01T13:00:00Z");

        // Verifica che la prima data è precedente alla seconda
        boolean isDate1BeforeDate2 = date1.isBefore(date2);

        // Verifica che la seconda data è successiva alla prima
        boolean isDate2AfterDate1 = date2.isAfter(date1);

        // Verifica che le due date sono uguali
        boolean areDatesEqual = date1.equals(date2);

        // Stampa i risultati
        System.out.println("La prima data è precedente alla seconda? " + isDate1BeforeDate2);
        System.out.println("La seconda data è successiva alla prima? " + isDate2AfterDate1);
        System.out.println("Le due date sono uguali? " + areDatesEqual);


    }
}