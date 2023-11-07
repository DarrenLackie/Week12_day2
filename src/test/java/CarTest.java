import Car.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car(EngineType.DIESEL, CarBodyType.ESTATE, "Green", 7500, Damage.DAMAGE1);
    }

    @Test
    public void canGetEngineType(){
        assertEquals(EngineType.DIESEL, car.getEngineType());
    }

    @Test
    public void canGetCarBodyType(){
        assertEquals(CarBodyType.ESTATE, car.getCarBodyType());
    }

    @Test
    public void canGetColour(){
        assertEquals("Green", car.getColour());
    }

    @Test
    public void canSetEngineType(){
        car.setEngineType(EngineType.ELECTRIC);
        assertEquals(EngineType.ELECTRIC, car.getEngineType());
    }

    @Test
    public void canSetCarBodyType(){
        car.setCarBodyType(CarBodyType.MONSTERTRUCK);
        assertEquals(CarBodyType.MONSTERTRUCK, car.getCarBodyType());
    }

    @Test
    public void canSetColour(){
        car.setColour("Yellow");
        assertEquals("Yellow", car.getColour());
    }

    @Test
    public void canGetPrice(){
        assertEquals(7500, car.getPrice());
    }

    @Test
    public void canReducePriceForDamage(){
        assertEquals(7400, car.priceWithDamage());
    }

    @Test
    public void canSetDamage(){
        car.setDamage(Damage.NODAMAGE);
        assertEquals(7500, car.priceWithDamage());
    }

}
