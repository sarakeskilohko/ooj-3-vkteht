import java.util.*;

public class teht2 {

    public static void main(String[] args) {

        Kyltti kyltti1 = new Kyltti(0, 0, "", "");
        luokyltti(kyltti1);
        tulosta(kyltti1);
        kylttimuutos(kyltti1);

        System.out.println("Haluatko luoda toisen kyltin? (vastaa 'kyllä' tai 'ei')");
        Scanner scanner = new Scanner(System.in);
        String vastaus1 = scanner.nextLine();
        if (vastaus1.equals("ei")) {
            System.exit(0);
        }
        else {
            Kyltti kyltti2 = new Kyltti(0, 0, "", "");
            luokyltti(kyltti2);
            tulosta(kyltti2);
            kylttimuutos(kyltti2);
        }

        System.out.println("Haluatko luoda kolmannen kyltin? (vastaa 'kyllä' tai 'ei')");
        Scanner scanneri = new Scanner(System.in);
        String vastaus2 = scanneri.nextLine();
        if (vastaus2.equals("ei")) {
            System.exit(0);
        }
        else {
            Kyltti kyltti3 = new Kyltti(0, 0, "", "");
            luokyltti(kyltti3);
            tulosta(kyltti3);
            kylttimuutos(kyltti3);
        }

        System.out.println("Haluatko vielä muokata jotain kylttiä? Kirjoita kyltin numero (1,2,3) tai 'ei'");
        Scanner skanner = new Scanner(System.in);
        String vastaus3 = skanner.nextLine();


    }

    public static Kyltti luokyltti (Kyltti kyltti) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anna leveys välillä 8-40");
        int leveys = scanner.nextInt();
        System.out.println("Anna korkeus välillä 3-6");
        int korkeus = scanner.nextInt();
        System.out.println("Anna kyltin teksti");
        scanner.nextLine();
        String teksti = scanner.nextLine();
        System.out.println("Valitse täyte (*, # tai -)");
        String täyte = scanner.nextLine();

        kyltti.asetaTäyte(täyte);
        kyltti.asetaKorkeus(korkeus);
        kyltti.asetaLeveys(leveys);
        kyltti.asetaTeksti(teksti);

        return kyltti;
    }


    public static void kylttimuutos (Kyltti kyltti) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Haluatko muuttaa täytettä? (*, # tai -) Kirjoita 'ei' jos haluat lopettaa.");

        String uusitäyte = scanner.nextLine();
        if (uusitäyte.equals("ei")) {
            System.exit(0);
        } else {
            kyltti.asetaTäyte(uusitäyte);
            tulosta(kyltti);
        }

        System.out.println("Haluatko muuttaa leveyttä? Kirjoita uusi leveys välillä 8-40, tai '0' jos haluat lopettaa");

        int uusileveys = scanner.nextInt();
        if (uusileveys == 0) {
            System.exit(0);
        } else {
            kyltti.asetaLeveys(uusileveys);
            tulosta(kyltti);
        }

        System.out.println("Haluatko muuttaa korkeutta? Kirjoita uusi korkeus välillä 3-6, tai '0' jos haluat lopettaa");

        int uusikorkeus = scanner.nextInt();
        if (uusikorkeus == 0) {
            System.exit(0);
        } else {
            kyltti.asetaKorkeus(uusikorkeus);
            tulosta(kyltti);
        }

        System.out.println("Haluatko muuttaa vielä kerran täytettä? Kirjoita uusi täyte (*, # tai -) tai 'ei' jos lopetat");
        scanner.nextLine();
        String uusiuusitäyte = scanner.nextLine();
        if (uusiuusitäyte.equals("ei")) {
            System.exit(0);
        } else {
            kyltti.asetaTäyte(uusiuusitäyte);
            tulosta(kyltti);
        }
    }

    public static void tulosta (Kyltti kyltti){
        final int k2 = (kyltti.annaKorkeus() - 1) / 2;
        final int l2 = (kyltti.annaLeveys() - kyltti.annaTeksti().length() - 2) / 2;
        String r = "";
        //aluksin luodaan "ylärivi"
        for (int i = 0; i < kyltti.annaLeveys(); i++) r += kyltti.annaTäyte();
        //tulostetaan ylärivi(t)
        for (int i = 0; i < k2; i++) System.out.println(r);
        //tulostetaan tekstin vasemmassa reunassa oleva täyte
        for (int i = 0; i < l2; i++) System.out.print(kyltti.annaTäyte());
        //tulostetaan haluttu teksti
        System.out.print(" " + kyltti.annaTeksti() + " ");
        //tulostetaan tekstin oikean puoleinen täyte
        for (int i = 0; i < kyltti.annaLeveys() - l2 - kyltti.annaTeksti().length() - 2; i++) System.out.print(kyltti.annaTäyte());
        System.out.println();
        //tulostetaan alarivi(t)
        for (int i = 0; i < kyltti.annaKorkeus() - k2 - 1; i++) System.out.println(r);
    }
}
