import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main mainTest = new Main();

    @Test
    void testDateComparisons(){

        // Creazione dei due oggetti Instant dalle stringhe ISO 8601
        Instant date1 = Instant.parse("2023-03-01T13:00:00Z");
        Instant date2 = Instant.parse("2024-03-01T13:00:00Z");
        // Verifica che la prima data è precedente alla seconda
        assertTrue(date1.isBefore(date2), "La prima data dovrebbe essere precedente alla seconda");

        // Verifica che la seconda data è successiva alla prima
        assertTrue(date2.isAfter(date1), "La seconda data dovrebbe essere successiva alla prima");

        // Verifica che le due date sono uguali
        assertNotEquals(date1, date2, "Le due date non dovrebbero essere uguali");

    }
    @Test
    void testGetYear() {
        // Creazione di un oggetto Instant
        Instant date = Instant.parse("2023-03-01T13:00:00Z");

        // Verifica che l'anno restituito sia corretto
        assertEquals(2023, mainTest.getYear(date), "L'anno dovrebbe essere 2023");
    }

    @Test
    void getMonth() {
        Instant date = Instant.parse("2023-03-01T13:00:00Z");
        assertEquals(3, mainTest.getMonth(date), "Il mese dovrebbe essere marzo (3)");
    }

    @Test
    void getDay() {
        Instant date = Instant.parse("2023-03-01T13:00:00Z");
        assertEquals(1, mainTest.getDay(date), "Il giorno dovrebbe essere (1)");
    }

    @Test
    void getDayofWeek() {
        Instant date = Instant.parse("2023-03-01T13:00:00Z");
        assertEquals(3, mainTest.getDayofWeek(date), "Il giorno della settimana dovrebbe essere (3)");
    }
}