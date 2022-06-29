package Practicum.P2;

public class Voetbalclub {
    private String name;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam){
        name = naam;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalGespeeld(){
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public int aantalPunten(){
        return  aantalGewonnen * 3 + aantalGelijk;

    }

    @Override
    public String toString() {
        return name
                + aantalGespeeld()
                + " "
                + aantalGewonnen
                + " "
                + aantalGelijk
                + " "
                + aantalVerloren
                + " "
                + aantalPunten()
                + " " ;
    }
}
