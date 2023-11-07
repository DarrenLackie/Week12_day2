import Car.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;

    @Before
    public void before(){
        customer = new Customer(10000);
        car = new Car(EngineType.DIESEL, CarBodyType.HATCHBACK, "Green", 7500, Damage.DAMAGE1);
    }

    @Test
    public void canGetWallet(){
        assertEquals(10000, customer.getWallet());
    }

    @Test
    public void canGetOwnedCars(){
        assertEquals(0, customer.getOwnedCars().size());
    }

    @Test
    public void canBuyACar(){
        assertEquals(2500, customer.buy(car));
        assertEquals(1, customer.getOwnedCars().size());
    }

}
