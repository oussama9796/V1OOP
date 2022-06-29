package Test;

public class Student {
    private String naam;
    private int leeftijd;
    private Opleiding mijnOpleiding;


    public void setOpleiding(Opleiding opl){
        mijnOpleiding = opl;
    }

    public Student(String nm, int lft){
        this.naam = nm;
        this.leeftijd = lft;
    }

    @Override
    public String toString() {
        String s = "naam: " + naam + "leeftijd: " + leeftijd;
        if (mijnOpleiding != null) {
            s += "en volgt opleiding: " + mijnOpleiding.getNaam();
        } else {
            s += " volgt geen opleiding";
        }
        return s;
    }
}
