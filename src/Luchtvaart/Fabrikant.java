package Luchtvaart;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Fabrikant {
    private static List<Fabrikant> alleFabrikanten = new ArrayList<>();
    private String naam;
    private String contactpersoon;

    public Fabrikant(String nm){
        this.naam = nm;
        addFabrikant(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fabrikant fabrikant = (Fabrikant) o;
        return Objects.equals(naam, fabrikant.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam);
    }

    public String getNaam() {
        return naam;
    }

    public static List<String> geefAlleFabrikanten(){
        List<String> fabrikantNamen = new ArrayList<>();
        for( Fabrikant f : alleFabrikanten){
            fabrikantNamen.add(f.getNaam());
        }
        return fabrikantNamen;
    }

    private boolean addFabrikant(Fabrikant toAdd){
        if(!alleFabrikanten.contains(toAdd)) return alleFabrikanten.add(toAdd);
        return false;
    }

    @Override
    public String toString() {
        return "Fabrikant{" +
                "naam='" + naam + '\'' +
                '}';
    }

    public static void main(String[] args) {
        for( String fabr : Fabrikant.geefAlleFabrikanten()){
            System.out.println(fabr);
        }
        Fabrikant f1 = new Fabrikant("Fokker");
        Fabrikant f2 = new Fabrikant("Fokker2");
        Fabrikant f3 = new Fabrikant("Fokker3");
        Fabrikant f4 = new Fabrikant("Fokker4");
        for( String fabr : Fabrikant.geefAlleFabrikanten()){
            System.out.println(fabr);
        }
    }


}
