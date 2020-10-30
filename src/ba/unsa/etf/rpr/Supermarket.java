package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];

    public Supermarket(){
        for (int i = 0; i < 1000; i++) {
            artikli[i] = null;
        }
    }

    public void dodajArtikl(Artikl artikl) {
        for (int i = 0; i < 1000; i++) {
            if (artikli[i]==null) {
                artikli[i] = new Artikl(artikl);
                break;
            }
        }
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl povratni = null;
        for (int i = 0; i < 1000; i++) {
            if (artikli[i].getKod().equals(kod)) {
                povratni = new Artikl(artikli[i]);
                artikli[i] = null;
                break;
            }
        }
        return povratni;
    }
}
