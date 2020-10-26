package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv, cijena;
    private int kod;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getCijena() {
        return cijena;
    }

    public void setCijena(String cijena) {
        this.cijena = cijena;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public Artikl(String naziv, int kodArtikla, String cijenaArtikla) {
        this.cijena = cijenaArtikla;
        this.kod = kodArtikla;
        this.naziv = naziv;
    }
}
