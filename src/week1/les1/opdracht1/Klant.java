package week1.les1.opdracht1;

public class Klant {
    private String naam, adres;
    private static int aantalKlanten = 0;

    public Klant(String nm, String adr) {
        naam = nm;
        adres = adr;

        aantalKlanten++;
        System.out.println("Klant-object " + aantalKlanten + " is gemaakt!");
    }

    public static int getAantalKlanten() {
        return aantalKlanten;
    }



}
