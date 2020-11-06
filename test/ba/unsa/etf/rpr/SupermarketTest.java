package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    @org.junit.jupiter.api.Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("biciklo", 25 , "1");
        s.dodajArtikl(a);
        assertTrue(s.getArtikli()[0] != null);
    }

    @org.junit.jupiter.api.Test
    void getArtikli() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("biciklo", 25 , "1");
        s.dodajArtikl(a);
        assertTrue(s.getArtikli() != null);
    }

    @org.junit.jupiter.api.Test
    void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("biciklo", 25 , "1");
        s.dodajArtikl(a);
        assertTrue(s.izbaciArtiklSaKodom("1")!=null);
    }
}