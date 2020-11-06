package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    @Test
    void getNaziv() {
        Artikl a = new Artikl("biciklo", 25 , "1");
        assertTrue(a.getNaziv().equals("biciklo"));
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("biciklo", 25, "1");
        assertTrue(a.getKod().equals("1"));
    }
    @Test
    void getCijena() {
        Artikl a = new Artikl("biciklo", 25 , "1");
        assertTrue(a.getCijena()==25);
    }

    @Test
    void KonstruktorTest() {
        Artikl a = new Artikl("cekic", 25,"2");
        assertTrue(a.getNaziv().equals("cekic"));
        assertTrue(a.getCijena()==25);
        assertTrue(a.getKod().equals("2"));
    }
}