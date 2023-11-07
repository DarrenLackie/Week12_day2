import Car.Car;

import java.util.ArrayList;

public class Customer implements ITransaction {

    private int wallet;
    private ArrayList<Car> ownedCars;

    public Customer(int wallet) {
        this.wallet = wallet;
        this.ownedCars = new ArrayList<Car>();
    }

    public int getWallet() {
        return wallet;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public int buy(Car car){
        ownedCars.add(car);
        return wallet - car.getPrice();
    }

    public int sell(Car car){
        ownedCars.remove(car);
        return wallet + car.getPrice();
    }
}
