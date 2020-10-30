package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv, kod;
    private int cijena;

    public Artikl(String naziv, int cijena, String kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }
    public Artikl(Artikl artikl) {
        naziv = artikl.naziv;
        cijena = artikl.cijena;
        kod = artikl.kod;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getKod() {
        return kod;
    }

    public int getCijena() {
        return cijena;
    }
}
