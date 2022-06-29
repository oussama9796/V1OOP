package GP;

public class Docent extends User {
    private int docentNummer;


    public Docent(int docentNummer,String nm , String un, String pw, String rol) {
        super(nm, un, pw, rol);
        this.docentNummer = docentNummer;
    }

    public int getDocentNummer() {
        return docentNummer;
    }

    public void setDocentNummer(int docentNummer) {
        this.docentNummer = docentNummer;
    }

    public boolean equals(Object obj) {
        boolean gelijk = obj instanceof Student;

        gelijk = gelijk && ((Docent) obj).docentNummer == (docentNummer);

        return gelijk;
    }

    @Override
    public String toString() {
        return super.toString() +
                " heeft docentNummer: " + docentNummer +
                '.';
    }
}
