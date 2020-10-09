public class auto extends teht1 {

    boolean ehjä;
    boolean varattu;

    public auto(boolean ehjä, boolean varattu) {
        this.ehjä = ehjä;
        this.varattu = varattu;
    }

    public boolean annaEhjä() {
        return ehjä;
    }

    public boolean annaVarattu() {
        return varattu;
    }

    public void asetaEhjä(boolean ehjä) {
        this.ehjä = ehjä;
    }
}
