package GP;

import java.util.ArrayList;

public class AbsentiePresentie {
    private boolean aanwezigheid;
    private ArrayList<Student> studentNummers;
    private ArrayList<Les> myLessen;

    public AbsentiePresentie(boolean aWH){
        aanwezigheid = aWH;
        studentNummers = new ArrayList<Student>();
        myLessen = new ArrayList<Les>();
    }

    public ArrayList<Student> getStudentNummers() {
        return studentNummers;
    }

    public ArrayList<Les> getMyLessen(){
        return myLessen;
    }
}
