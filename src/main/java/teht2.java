import java.util.Scanner;

public class teht2 {

    public static void main(String[] args) {
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

        tulosta(leveys, korkeus, teksti, täyte);

        System.out.println("Haluatko muuttaa täytettä? (*, # tai -) Kirjoita 'ei' jos haluat lopettaa.");

        String uusitäyte = scanner.nextLine();
        if (uusitäyte.equals("ei")){
            System.exit(0);
        } else {
            tulosta(leveys, korkeus, teksti, uusitäyte);
        }
    }


    public static void tulosta (final int leveys, final int korkeus, final String teksti, final String täyte){
        final int k2 = (korkeus - 1) / 2;
        final int l2 = (leveys - teksti.length() - 2) / 2;
        String r = "";
        //aluksin luodaan "ylärivi"
        for (int i = 0; i < leveys; i++) r += täyte;
        //tulostetaan ylärivi(t)
        for (int i = 0; i < k2; i++) System.out.println(r);
        //tulostetaan tekstin vasemmassa reunassa oleva täyte
        for (int i = 0; i < l2; i++) System.out.print(täyte);
        //tulostetaan haluttu teksti
        System.out.print(" " + teksti + " ");
        //tulostetaan tekstin oikean puoleinen täyte
        for (int i = 0; i < leveys - l2 - teksti.length() - 2; i++) System.out.print(täyte);
        System.out.println();
        //tulostetaan alarivi(t)
        for (int i = 0; i < korkeus - k2 - 1; i++) System.out.println(r);
    }
}
