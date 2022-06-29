package Test3;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuchtvaartMaatschappij implements Serializable {
    private String naam;
    private ArrayList<Vliegtuig> alleVliegtuigen;

    public LuchtvaartMaatschappij(String nm){
        this.naam = nm;
    }

    public List<Vliegtuig> getVliegtuigen(){
        return Collections.unmodifiableList(alleVliegtuigen);
    }

    public boolean heeftVliegtuig(String type){
        boolean result = false;

        for (Vliegtuig vliegtuig:alleVliegtuigen) {
            if (vliegtuig.getType().equals(type)) {
                result = true;
                break;
            }

        }
        return result;
    }

    public void voegVliegtuigToe(Vliegtuig v){
        if (!alleVliegtuigen.contains(v)){
            alleVliegtuigen.add(v);
        }
    }
}
