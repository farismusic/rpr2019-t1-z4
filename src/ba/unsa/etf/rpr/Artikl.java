package ba.unsa.etf.rpr;

public class Artikl{

    String naziv, kod;
    int cijena;

    public Artikl(String biciklo, int i, String s) {

        naziv = biciklo;
        cijena = i;
        kod = s;

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
