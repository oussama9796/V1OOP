package Practicum5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen;

    public Klas(String klasCode) {
        this.klasCode = klasCode;
        leerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling l){
        this.leerlingen.add(l);
    }

    public void wijzigCijfer(String naam, double nieuweCijfer){
        for (Leerling leerling: leerlingen) {
            if (leerling.getNaam().equals(naam))
                leerling.setCijfer(nieuweCijfer);

        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public int aantalLeerlingen(){
        return leerlingen.size();
    }

    @Override
    public String toString() {
        String str = "In klas " + klasCode + " zitten de volgende leerlingen: " + "\n";
        for (Leerling l: leerlingen) {
            str += l;
        }
        return str;
    }
}
