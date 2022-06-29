package Practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public double getKorting() {
        return kortingsPercentage;
    }

    public void setKorting(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    public Klant(String naam, double kortingsPercentage) {
        this.naam = naam;
        this.kortingsPercentage = kortingsPercentage;
    }

    public Klant(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam + " (korting: " + kortingsPercentage + "%)";
    }
}
