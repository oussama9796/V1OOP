package Practicum3;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int xp, int yp)throws IllegalArgumentException{
        if (rad <= 0)
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        radius = rad;
        xPositie = xp;
        yPositie = yp;
    }

    @Override
    public String toString() {
        if (radius == 0)
            return null ;
        return "cirkel(" + xPositie + ", " + yPositie +  ") met radius: " + radius;
    }

}
