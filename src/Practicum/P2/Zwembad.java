package Practicum.P2;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double br,double le,double di){
        breedte = br;
        lengte = le;
        diepte = di;
    }

    public Zwembad(){

    }

    public double getBreedte() {
        return breedte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double inhoud(){
        return breedte*lengte*diepte;
    }

    @Override
    public String toString() {
        return  "Dit zwembad is " + breedte +
                " meter breed, " + lengte +
                " meter lang, en " + diepte +
                " meter diep";
    }
}
