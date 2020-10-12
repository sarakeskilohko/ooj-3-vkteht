public class Kyltti extends teht2 {

    int leveys;
    int korkeus;
    String teksti;
    String täyte;

    public Kyltti(int leveys, int korkeus, String teksti, String täyte) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.teksti = teksti;
        this.täyte = täyte;
    }

    public int annaLeveys() {
        return leveys;
    }

    public int annaKorkeus() {
        return korkeus;
    }

    public String annaTeksti() {
        return teksti;
    }

    public String annaTäyte() {
        return täyte;
    }

    public void asetaLeveys(int leveys){
        this.leveys = leveys;
    }

    public void asetaKorkeus(int korkeus){
        this.korkeus = korkeus;
    }

    public void asetaTeksti(String teksti){
        this.teksti = teksti;
    }

    public void asetaTäyte(String täyte){
        this.täyte = täyte;
    }
}
