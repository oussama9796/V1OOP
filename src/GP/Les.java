package GP;

import java.sql.Time;
import java.time.LocalDate;

public class Les {
    private int ID;
    private LocalDate Datum;
    private Time Tijd;

    public Les(int id, LocalDate datum, Time tijd){
        ID = id;
        Datum = datum;
        Tijd = tijd;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDate getDatum() {
        return Datum;
    }

    public void setDatum(LocalDate datum) {
        Datum = datum;
    }

    public Time getTijd() {
        return Tijd;
    }

    public void setTijd(Time tijd) {
        Tijd = tijd;
    }

    public boolean equals(Object obj) {
        boolean gelijk = obj instanceof Les;

        gelijk = gelijk && ((Les) obj).Datum == (Datum);
        gelijk = gelijk && ((Les) obj).Tijd == (Tijd);
        gelijk = gelijk && ((Les) obj).ID == (ID);


        return gelijk;
    }

    @Override
    public String toString() {
        return "Les " +  ID +
                " is op " + Datum +
                " begint om " + Tijd +
                '.';
    }
}
