import java.util.*;
public class teht1<Matka>{

    //* Tehtävä: suunnittele ja toteuta tehtävän asetelma niin, että voidaan korkealla tasolla rakentaa
    // opiskelijalle toimintalogiikka, joka priorisoi seuraavaa matkaa varten käytettävissä olevat autot
    // järjestyksessä: 1) oma 2) ainejärjestön auto 3) vuokra-auto. Toteuta myös tämä korkean logiikan metodi.
    // Käytä System.out.println-metodia apuna kertomaan päätöksenteon logiikkaa vaihe vaiheelta.
    // Oletetaan, että maailma toimii täysin peräkkäisesti eikä eri toimijoiden toimia tarvitse synkronoida
    // ohjelmassa säietekniikoin.


    public static void main (String[] args) {

        //* luodaan autot, jotta oikea auto löytää oikeaan paikkaan

        auto omaAuto = new auto(aja(Matka),true);
        auto aineAuto = new auto(true,onkoVapaa());
        auto vuokraAuto = new auto(true,true);

        omaAuto.asetaEhjä(aja(Matka matka));
        System.out.println("Tarkistetaan, millä autolla voidaan ajaa.");

        if (omaAuto.annaEhjä()) {
            aja(Matka matka);
            korjaa(omaAuto);
            System.out.println("Oma auto oli ehjä, matka tehtiin sillä.");
        }
        else if (!aineAuto.annaVarattu()) {
            ajaMuuAuto(Matka, aineAuto);
            palautaAuto(aineAuto);
            korjaa(omaAuto);
            System.out.println("Oma auto oli rikki, matka tehtiin ainejärjestön autolla.");
        }
        else {
            ajaMuuAuto(Matka, vuokraAuto);
            System.out.println("Oma auto oli rikki ja ainejärjestön auto varattu, matka tehtiin vuokra-autolla.");
        }
        System.out.println("Oma auto korjataan.");
    }




    //* opiskelijan auton ajologiikka


    boolean ehjä;
    public boolean aja(Matka matka) {
        ehjä &= new Random().nextBoolean();
        return ehjä;
    }

    public void korjaa() {
        ehjä = true;
    }

    //* ainejärjestön auto:
    public static boolean onkoVapaa() {
        boolean vapaa = new Random().nextBoolean();
        return vapaa;
    }






}
