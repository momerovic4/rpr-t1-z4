package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];

    public boolean dodajArtikl(Artikl a) {
        for (int i = 0; i < 1000; i++) {
            if (artikli[i]==null) {
                artikli[i] = new Artikl(a);
                return true;
            }
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return  artikli;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for (int i = 0; i < 50; i++) {
            if (artikli[i]==null) continue;
            else ukupnaCijena = ukupnaCijena + artikli[i].getCijena();
        }
        return ukupnaCijena;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl povratni = null;
        for (int i = 0; i < 50; i++) {
            if (artikli[i].getKod().equals(kod)) {
                povratni = new Artikl(artikli[i]);
                artikli[i] = null;
                break;
            }
        }
        return povratni;
    }
}
