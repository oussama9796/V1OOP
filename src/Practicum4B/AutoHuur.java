package Practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {

    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public AutoHuur(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public double totaalPrijs(){
        if (huurder == null || gehuurdeAuto == null)
            return 0;
        return aantalDagen * getGehuurdeAuto().getPrijsPerDag() * (100 - huurder.getKorting()) / 100;

    }

    @Override
    public String toString() {
        String geen = "\t";
        if (getGehuurdeAuto() == null)
            geen += "er is geen auto bekend";
        else
            geen += "autotype: " + getGehuurdeAuto();
        geen += "\n\t";
        if (getHuurder() == null)
            geen += "er is geen huurder bekend";
        else
            geen += "op naam van: " + getHuurder();
        geen += "\n\taantal dagen: " + getAantalDagen() + " en dat kost " + totaalPrijs();
        return geen;
    }
}
