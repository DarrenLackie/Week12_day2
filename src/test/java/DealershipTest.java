import Car.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;
    Car car2;

    @Before
    public void before(){
        dealership = new Dealership(100000);
        car = new Car(EngineType.DIESEL, CarBodyType.HATCHBACK, "Green", 7500, Damage.NODAMAGE);
        car2 = new Car(EngineType.HYBRID, CarBodyType.SUV, "Blue", 10000, Damage.DAMAGE5);
        dealership.addCarToStock(car);
    }

    @Test
    public void canGetTill(){
        assertEquals(100000, dealership.getTill());
    }

    @Test
    public void canGetCarsInStock(){
        assertEquals(1, dealership.getCarsInStock().size());
    }

    @Test
    public void canSellACar(){
        dealership.sell(car);
        assertEquals(107500, dealership.getTill());
        assertEquals(0, dealership.getCarsInStock().size());
    }

    @Test
    public void canBuyACar(){
        dealership.buy(car2);
        assertEquals(95000, dealership.getTill());
        assertEquals(2, dealership.getCarsInStock().size());
    }

    @Test
    public void canRepairCar(){
        dealership.repairCar(car2);
        assertEquals(10000, car2.priceWithDamage());
    }

}
