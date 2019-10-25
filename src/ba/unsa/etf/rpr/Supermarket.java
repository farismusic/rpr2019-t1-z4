package ba.unsa.etf.rpr;

public class Supermarket {

    private Artikl[] artikli = new Artikl[1000];
    private int brojArtikala = 0;

    public void dodajArtikl(Artikl biciklo) {
        artikli[brojArtikala] = biciklo;
        brojArtikala++;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        Artikl izbaci= null;

        for(int i = 0; i < brojArtikala; i++){
            if(artikli[i].getKod().equals(kod)){
                izbaci = artikli[i];
                artikli[i] = artikli[brojArtikala - 1];
                brojArtikala--;
            }
        }

        return izbaci;
    }
}
