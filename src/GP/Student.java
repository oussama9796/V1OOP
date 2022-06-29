package GP;


public class Student extends User {
    private int studentNummer;

    public Student(int studentNummer,String nm , String un, String pw, String rol) {
        super(nm, un, pw, rol);
        this.studentNummer = studentNummer;
    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(int studentNummer) {
        this.studentNummer = studentNummer;
    }

    public boolean equals(Object obj) {
        boolean gelijk = obj instanceof Student;

        gelijk = gelijk && ((Student) obj).studentNummer == (studentNummer);

        return gelijk;
    }

    @Override
    public String toString() {
        return super.toString() + " heeft studentNummer:" + studentNummer + '.';
    }
}
