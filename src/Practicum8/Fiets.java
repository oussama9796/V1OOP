package Practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig{
    private int framenummer;

    public Fiets(int fnr, String tp, double pr, int jr) {
        super(tp, pr, jr);
        framenummer = fnr;
    }


    @Override
    public double huidigeWaard() {
        int huidigJaar = LocalDate.now().getYear();
        int jaar = huidigJaar - bouwjaar;
        double huidigePrijs = nieuwprijs;
        for (int y = 0; y < jaar; y++) {
            huidigePrijs = huidigePrijs / 100 * 90;
        }
        return huidigePrijs;
    }






    @Override
    public boolean equals(Object obj) {
        boolean fietsDuplicaat = false;

        if (obj instanceof Fiets f && this.framenummer == f.framenummer && this.nieuwprijs == super.nieuwprijs && this.bouwjaar == super.bouwjaar) {
            fietsDuplicaat = true;
        }

        return fietsDuplicaat;
    }

}
