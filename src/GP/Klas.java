package GP;

import java.util.ArrayList;

public class Klas {
    private String klasNaam;
    private ArrayList<Student> studenten;
    private ArrayList<Rooster> weekRoosters;

    public Klas(String kN){
        klasNaam = kN;
        studenten = new ArrayList<Student>();
        weekRoosters = new ArrayList<Rooster>();
    }

    public ArrayList<Student> getStudenten() {
        return studenten;
    }

    public ArrayList<Rooster> getWeekRoosters(){
        return weekRoosters;
    }
}
