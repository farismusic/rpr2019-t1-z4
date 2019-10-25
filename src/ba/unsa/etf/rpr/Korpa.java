package ba.unsa.etf.rpr;


import java.util.Arrays;

public class Korpa {

    private Artikl[] artikli = new Artikl[50];
    private int brojArtikala = 0;


    public boolean dodajArtikl(Artikl a) {
        if(getBrojArtikala() != 50) {
            artikli[getBrojArtikala()] = a;
            brojArtikala = getBrojArtikala() + 1;
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

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;

        for(int i = 0; i < getBrojArtikala(); i++){
            suma += artikli[i].getCijena();
        }

        return suma;
    }

    public int getBrojArtikala() {
        return brojArtikala;
    }
}
