package GP;

import java.util.ArrayList;

public class Rooster {
    private int weekNummer;
    private ArrayList<Les> lessen;

    public Rooster(int wK) {
        weekNummer = wK;
        lessen = new ArrayList<Les>();
    }

    public ArrayList<Les> getLessen() {
        return lessen;
    }

}
