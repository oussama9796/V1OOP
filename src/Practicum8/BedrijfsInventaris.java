package Practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private  double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfsInventaris(String nm, double bud) {
        bedrijfsnaam = nm;
        budget = bud;
        alleGoederen = new ArrayList<>();
    }

    public void schafAan(Goed g){
        if (budget >= g.huidigeWaard() && !alleGoederen.contains(g)){
            alleGoederen.add(g);
            budget = budget - g.huidigeWaard();
        }

    }

    @Override
    public String toString() {
        String k = "Invetaris: " ;
        for (Goed goed: alleGoederen) {
            k += "\n" + goed ;
        }
        return k;
    }


}
