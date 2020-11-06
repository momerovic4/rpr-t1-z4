package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    @org.junit.jupiter.api.Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("biciklo", 25 , "1");
        assertTrue(k.dodajArtikl(a));
    }

    @org.junit.jupiter.api.Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("biciklo", 25 , "1");
        k.dodajArtikl(a);
        assertEquals(25,k.dajUkupnuCijenuArtikala());
    }

    @org.junit.jupiter.api.Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("biciklo", 25 , "1");
        k.dodajArtikl(a);
        assertTrue(k.izbaciArtiklSaKodom("1")!=null);
    }
}