package Practicum4B;

public class Auto {
    private String type;
    private double prijsPerDag;

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    public Auto(String type, double prijsPerDag) {
        this.type = type;
        this.prijsPerDag = prijsPerDag;
    }

    @Override
    public String toString() {
        return type + "  met prijs per dag: " + prijsPerDag;
    }
}
