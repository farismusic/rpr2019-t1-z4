package ba.unsa.etf.rpr;


public class Korpa {

    private Artikl[] artikli = new Artikl[50];
    private int brojArtikala = 0;


    public boolean dodajArtikl(Artikl a) {
        if(brojArtikala != 50) {
            artikli[brojArtikala] = a;
            brojArtikala++;
            return true;
        } else{
            return false;
        }
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

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;

        for(Artikl i : artikli){
            suma += i.getCijena();
        }

        return suma;
    }
}
