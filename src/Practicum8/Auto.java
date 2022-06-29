package Practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig{
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp , pr, jr);
        kenteken = kt;

    }


    @Override
    public double huidigeWaard() {
        int huidigJaar = LocalDate.now().getYear();
        int jaar = huidigJaar - bouwjaar;
        double huidigePrijs = nieuwprijs;
        for (int y = 0; y < jaar; y++) {
            huidigePrijs = huidigePrijs / 100 * 70;
        }
        return huidigePrijs;
    }

    @Override
    public boolean equals(Object obj) {
        boolean autoDuplicaat = false;

        if (obj instanceof Auto a && this.kenteken.equals(a.kenteken) && this.nieuwprijs == super.nieuwprijs && this.bouwjaar == super.bouwjaar) {
            autoDuplicaat = true;
        }

        return autoDuplicaat;
    }



}
