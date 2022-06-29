package Test2;

public class Trein extends Voertuig {
    private boolean inVeiligheidsModus;

    public Trein(String tp, int mS){
        super(tp, mS);
    }

    public void setVeiligheidsModus(boolean vM){
        inVeiligheidsModus = vM;
    }
    @Override
    public void snelheidVerhogen() {
        int max = maximumSnelheid;

        if (inVeiligheidsModus == true){
            max /= 2;
        }
        if (huidigeSnelheid + 20 <= max ){
            huidigeSnelheid += 20;
        }
    }

    @Override
    public void snelheidVerlagen() {

    }
}
