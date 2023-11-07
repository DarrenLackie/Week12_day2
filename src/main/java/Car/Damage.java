package Car;

public enum Damage {

    NODAMAGE(0),
    DAMAGE1(100),
    DAMAGE2(300),
    DAMAGE3(750),
    DAMAGE4(1500),
    DAMAGE5(5000);

    public final int reductionInPrice;

    Damage(int reductionInPrice){
        this.reductionInPrice = reductionInPrice;
    }

    public int getReductionInPrice(){
        return reductionInPrice;
    }
}
