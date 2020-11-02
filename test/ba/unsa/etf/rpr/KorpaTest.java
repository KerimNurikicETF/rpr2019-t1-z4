package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Korpa a;

    @BeforeEach
    void inicijalizacija(){
        a = new Korpa();
    }

    @Test
    void izbaciArtiklSaKodom() {
        a.dodajArtikl(new Artikl("biciklo", 12345, "150"));
        Artikl b = a.izbaciArtiklSaKodom("12345");
        assertAll(() -> assertEquals(0, a.getBrojArtikala()),
            () -> assertEquals(12345, b.getKod())
        );
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        a.dodajArtikl(new Artikl("biciklo", 12345, "150"));
        a.dodajArtikl(new Artikl("abiciklo", 123456, "153"));
        assertEquals(303, a.dajUkupnuCijenuArtikala());
    }

    @Test
    void dodajArtikl() {
        a.dodajArtikl(new Artikl("biciklo", 12345, "150"));
        assertEquals(1, a.getBrojArtikala());
    }
}