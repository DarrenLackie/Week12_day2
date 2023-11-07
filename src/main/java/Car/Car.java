package Car;

public class Car {

    EngineType engineType;
    CarBodyType carBodyType;
    private String colour;
    private int price;
    Damage damage;

    public Car(EngineType engineType, CarBodyType carBodyType, String colour, int price, Damage damage) {
        this.engineType = engineType;
        this.carBodyType = carBodyType;
        this.colour = colour;
        this.price = price;
        this.damage = damage;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price - priceWithDamage();
    }

    public Damage getDamage(){
        return damage;
    }

    public int priceWithDamage(){
        int reduction = getDamage().getReductionInPrice();
        return getPrice() - reduction;
    }

    public Damage setDamage(Damage damage){
        return this.damage = damage;
    }
}
