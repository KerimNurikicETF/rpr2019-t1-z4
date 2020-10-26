package ba.unsa.etf.rpr;

public class Korpa {
    private int brojArtikala = 0;
    private Artikl[] artikli = new Artikl[50];

    public int getBrojArtikala() {
        return brojArtikala;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        int indeks = -1;
        for (int i = 0; i < brojArtikala; i++)
            if (artikli[i].getKod() == Integer.parseInt(kod)) {
                indeks = i;
                for (int j = i; j < brojArtikala - 1; j++) {
                    artikli[j] = artikli[j + 1];
                }
                brojArtikala = brojArtikala - 1;
            }
        if (indeks != -1)
            return artikli[indeks];
        else return null;
    }
    public int dajUkupnuCijenuArtikala(){
        int suma=0;
        for (int i=0;i<brojArtikala;i++)
            suma=suma+Integer.parseInt(artikli[i].getCijena());
        return suma;
    }

    public void setBrojArtikala(int brojArtikala) {
        this.brojArtikala = brojArtikala;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public boolean dodajArtikl(Artikl artikl) {
        if(brojArtikala<49) {
            artikli[brojArtikala] = new Artikl(artikl.getNaziv(), artikl.getKod(), artikl.getCijena());
            brojArtikala = brojArtikala + 1;
            return true;
        }
        else return false;
    }
}
