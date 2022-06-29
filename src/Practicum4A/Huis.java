package Practicum4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    public Huis(String adres, int bouwjaar) {
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    @Override
    public String toString() {
        return "Huis " + adres
                + " is gebouwd in "
                + bouwjaar
                + "\n"
                + "en heeft huisbaas "
                + huisbaas;
    }
}
