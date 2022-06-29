package GP;

import java.util.ArrayList;

public abstract class User {
    private String naam;
    protected String username;
    protected String password;
    protected String rol;

    private ArrayList<Docent> docent = new ArrayList<Docent>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Beheerder> beheerders = new ArrayList<Beheerder>();

    public User(String naam, String username, String password, String rol) {
        this.naam = naam;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean equals(Object obj) {
        boolean gelijk = obj instanceof User;

        gelijk = gelijk && ((User) obj).username.equals(username);
        gelijk = gelijk && ((User) obj).password.equals(password);
        gelijk = gelijk && ((User) obj).rol.equals(rol);

        return gelijk;
    }

    @Override
    public String toString() {
        return rol + " heet " + naam + " heeft username: " + username ;
    }
}
