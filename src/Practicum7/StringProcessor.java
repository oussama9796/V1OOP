package Practicum7;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen;

    public StringProcessor(){
        processen = new ArrayList<>();
    }

    public String verwerk(String input){
        String out = input;
        for (OpmaakProces proces:processen) {
            out = proces.maakOp(out);
        }
        return out;
    }

    public void voegProcesToe(OpmaakProces proces){
        processen.add(proces);
    }
}
