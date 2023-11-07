import Car.*;
import java.util.ArrayList;

public class Dealership implements ITransaction {

    private int till;
    private ArrayList<Car> carsInStock;

    public Dealership(int till) {
        this.till = till;
        this.carsInStock = new ArrayList<>();
    }

    public int getTill() {
        return till;
    }

    public ArrayList<Car> getCarsInStock() {
        return carsInStock;
    }

    public void addCarToStock(Car car){
        carsInStock.add(car);
    }

    public int sell(Car car){
        till += car.getPrice();
        carsInStock.remove(car);
        return till;
    }

    public int buy(Car car){
        int finalPrice = car.getDamage().getReductionInPrice();
        carsInStock.add(car);
        return till -= finalPrice;
    }

    public int repairCar(Car car){
        int repairCost = car.getDamage().getReductionInPrice();
        till -= repairCost;
        car.setDamage(Damage.NODAMAGE);
        return car.priceWithDamage();
    }
}
