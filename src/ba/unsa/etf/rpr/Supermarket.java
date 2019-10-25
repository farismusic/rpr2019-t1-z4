package ba.unsa.etf.rpr;

import java.util.Arrays;

public class Supermarket {

    private Artikl[] artikli = new Artikl[1000];
    private int brojArtikala = 0;

    public Supermarket(){
        for(int i = 0; i < 1000; i++){
            artikli[i] = null;
        }
    }

    public void dodajArtikl(Artikl biciklo) {
        artikli[getBrojArtikala()] = biciklo;
        brojArtikala = getBrojArtikala() + 1;

    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        Artikl izbaci= null;

        if(getBrojArtikala() == 1 && artikli[0].getKod().equals(kod)){
            artikli[0] = null;
            brojArtikala = 0;
            return artikli[0];
        }

        for(int i = 0; i < getBrojArtikala(); i++){
            if(artikli[i].getKod().equals(kod)){
                izbaci = artikli[i];
                artikli[i] = artikli[getBrojArtikala() - 1];
                artikli[getBrojArtikala() - 1] = null;
                brojArtikala = getBrojArtikala() - 1;
            }
        }


        return izbaci;
    }

    public int getBrojArtikala() {
        return brojArtikala;
    }
}
