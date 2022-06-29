package GP;

public class Beheerder extends User {
    private int id;


    public Beheerder(int id, String nm , String un, String pw, String rol) {
        super(nm, un, pw, rol);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        boolean gelijk = obj instanceof Beheerder;

        gelijk = gelijk && ((Beheerder) obj).id == (id);

        return gelijk;
    }

    @Override
    public String toString() {
        return super.toString() +
                " heeft id: " + id ;
    }
}
