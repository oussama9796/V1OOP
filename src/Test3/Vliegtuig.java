package Test3;

import java.io.Serializable;
import java.util.Objects;

public class Vliegtuig implements Serializable {
    private String type;
    private int aantalMotoren;
    private String registratieNummer;

    public Vliegtuig(String tp, int aM, String rN){
        this.type = tp;
        this.aantalMotoren = aM;
        this.registratieNummer = rN;
    }

    public String getType(){
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vliegtuig)) return false;
        Vliegtuig vliegtuig = (Vliegtuig) o;
        return aantalMotoren == vliegtuig.aantalMotoren && Objects.equals(type, vliegtuig.type) && Objects.equals(registratieNummer, vliegtuig.registratieNummer);
    }




}
