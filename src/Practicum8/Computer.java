package Practicum8;

import java.time.LocalDate;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private  int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        type = tp;
        macAdres = adr;
        aanschafPrijs = pr;
        productieJaar = jr;
    }


    @Override
    public double huidigeWaard() {
        int huidigJaar = LocalDate.now().getYear();
        int jaar = huidigJaar - productieJaar;
        double huidigePrijs = aanschafPrijs;
        for (int y = 0; y < jaar; y++) {
            huidigePrijs = huidigePrijs / 100 * 60;
        }
        return huidigePrijs;
    }

    @Override
    public boolean equals(Object obj) {
        boolean computerDuplicaat = false;

        if (obj instanceof Computer c && this.type.equals(c.type) && this.macAdres.equals(c.macAdres) && this.aanschafPrijs == c.aanschafPrijs && this.productieJaar == c.productieJaar) {
            computerDuplicaat = true;
        }

        return computerDuplicaat;
    }

    @Override
    public String toString() {
        String info = "Computer: " + this.type  + " met macAdres " + this.macAdres + " met bouwjaar " + this.productieJaar + " heeft een waarde van : €" + String.format("%.2f", huidigeWaard());
        return info;
    }




}
