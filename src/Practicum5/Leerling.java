package Practicum5;

public class Leerling {
    private String naam;
    private  double cijfer;

    public String getNaam() {
        return naam;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    public Leerling(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam + " heeft cijfer: " + cijfer + "\n" ;
    }
}
