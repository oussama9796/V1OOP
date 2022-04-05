package week1.les1.opdracht1;

public class main {
    public static void main(String[] args) {
        System.out.println("Aantal Klant-objecten: "+Klant.getAantalKlanten());
        Klant k1 = new Klant("Henk", "Nijenoord 1");
        Klant k2 = new Klant("Wim", "Oudenoord 330");
        Klant k3 = new Klant("Hans", "Daltonlaan 200");
        System.out.println("Aantal Klant-objecten: "+Klant.getAantalKlanten());
    }

}



