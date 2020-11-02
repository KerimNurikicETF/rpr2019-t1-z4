package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
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
    void dodajArtikl() {
        a.dodajArtikl(new Artikl("biciklo", 12345, "150"));
        assertEquals(1, a.getBrojArtikala());
    }
}