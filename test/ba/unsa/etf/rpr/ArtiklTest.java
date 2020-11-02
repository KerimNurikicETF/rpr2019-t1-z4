package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    private Artikl a;
    @BeforeEach
    void inicijalizacija() {
        a = new Artikl("biciklo", 225, "150");
    }

    @Test
    void getNazivTest() {
        assertEquals("biciklo",a.getNaziv());
    }

    @Test
    void setNazivTest() {
        a.setNaziv("automobil");
        assertEquals("automobil", a.getNaziv());
    }

    @Test
    void getCijenaTest() {
        assertEquals("150", a.getCijena());
    }

    @Test
    void setCijenaTest() {
        a.setCijena("200");
        assertEquals("200", a.getCijena());
    }

    @Test
    void getKodTest() {
        assertEquals(225,a.getKod());
    }

    @Test
    void setKodTest() {
        a.setKod(123);
        assertEquals(123, a.getKod());
    }
}