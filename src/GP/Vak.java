package GP;

public class Vak {
    private String naam;

    public Vak(String nm){
        naam = nm;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Vak: " + naam ;
    }
}
