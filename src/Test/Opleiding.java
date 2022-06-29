package Test;

public class Opleiding {
    String naam;
    String variant;
    int studieduur;
    int minimumECs;

    public Opleiding(String nm, int std, int mEs){
        this.naam = nm;
        this.studieduur = std;
        this.minimumECs = mEs;
    }

    public Opleiding(String nm, String v, int std, int mEs){
        this(nm, std, mEs);
        variant = v;
    }

    public String getNaam() {
        return naam;
    }

    public void setStudieduur(int studieduur) {
        this.studieduur = studieduur;
    }
}
