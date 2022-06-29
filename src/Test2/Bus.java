package Test2;

public class Bus extends Voertuig {
    private int zitplaatsen;

    public Bus(String tp, int mS, int zp){
        super(tp, mS);
        this.zitplaatsen = zp;
    }


    @Override
    public void snelheidVerhogen() {

    }

    @Override
    public void snelheidVerlagen() {

    }

    public String toString(){
        return "Bus (" + zitplaatsen + " zitplaatsen) rijdt nu " + this.huidigeSnelheid + " (max.: " + this.maximumSnelheid + ")." + super.toString();
    }
}
