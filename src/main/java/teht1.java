import java.util.*;
public class teht1{

    //* Tehtävä: suunnittele ja toteuta tehtävän asetelma niin, että voidaan korkealla tasolla rakentaa
    // opiskelijalle toimintalogiikka, joka priorisoi seuraavaa matkaa varten käytettävissä olevat autot
    // järjestyksessä: 1) oma 2) ainejärjestön auto 3) vuokra-auto. Toteuta myös tämä korkean logiikan metodi.
    // Käytä System.out.println-metodia apuna kertomaan päätöksenteon logiikkaa vaihe vaiheelta.
    // Oletetaan, että maailma toimii täysin peräkkäisesti eikä eri toimijoiden toimia tarvitse synkronoida
    // ohjelmassa säietekniikoin.


    public static void main (String[] args) {

        //* luodaan autot, jotta oikea auto löytää oikeaan paikkaan
        Matka matka = new Matka(new Random().nextInt());
        auto omaAuto = new auto(aja(matka), true);
        auto aineAuto = new auto(true, onkoVapaa());
        auto vuokraAuto = new auto(true, true);


        omaAuto.asetaEhjä(aja(matka));
        System.out.println("Tarkistetaan, millä autolla voidaan ajaa.");


    }
    //* opiskelijan auton ajologiikka


    static boolean ehjä;
    public static boolean aja(Matka matka) {
        ehjä &= new Random().nextBoolean();
        return ehjä;
    }

    public void korjaa(auto auto) {
        ehjä = true;
    }

    //* ainejärjestön auto:
    public static boolean onkoVapaa() {
        boolean vapaa = new Random().nextBoolean();
        return vapaa;
    }

    public static void ajaMuuAuto(auto auto){
        System.out.println("Matka suoritettu.");
    }

    public static void palautaAuto(auto auto){
        System.out.println("Ajossa käytetty auto palautettiin oikeaan osoitteeseen.");
    }

    //* luodaan autot, jotta oikea auto löytää oikeaan paikkaan
    Random random = new Random();
    Matka matka = new Matka(random.nextInt());
    auto omaAuto = new auto(aja(matka), true);
    auto aineAuto = new auto(true, onkoVapaa());
    auto vuokraAuto = new auto(true, true);

    public void Ajo(){
            if (omaAuto.annaEhjä()) {
                aja(matka);
                korjaa(omaAuto);
                System.out.println("Oma auto oli ehjä, matka tehtiin sillä.");
            }
            else if (!aineAuto.annaVarattu()) {
                ajaMuuAuto(aineAuto);
                palautaAuto(aineAuto);
                korjaa(omaAuto);
                System.out.println("Oma auto oli rikki, matka tehtiin ainejärjestön autolla.");
            }
            else {
                ajaMuuAuto(vuokraAuto);
                System.out.println("Oma auto oli rikki ja ainejärjestön auto varattu, matka tehtiin vuokra-autolla.");
            }
            System.out.println("Oma auto korjataan.");
        }
        }
