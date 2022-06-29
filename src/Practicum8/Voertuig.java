package Practicum8;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr) {
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;
    }

    @Override
    public boolean equals(Object obj) {
        boolean voertuigDuplicaat = false;

        if (obj instanceof Voertuig v) {
            if (this.type.equals(v.type) && this.nieuwprijs == v.nieuwprijs && this.bouwjaar == v.bouwjaar) {
                voertuigDuplicaat = true;
            }
        }

        return voertuigDuplicaat;
    }


    @Override
    public String toString() {
        String info = "Voertuig: " + this.type + " met bouwjaar " + bouwjaar + " heeft een waarde van: €" + String.format("%.2f", huidigeWaard());
        return info;
    }
}
