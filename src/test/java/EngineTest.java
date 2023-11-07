import Car.Engine;
import Car.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(EngineType.ELECTRIC, 0, 200);
    }

    @Test
    public void canGetEngineType(){
        assertEquals(EngineType.ELECTRIC, engine.getEngineType());
    }

    @Test
    public void canGetEngineSize(){
        assertEquals(0, engine.getSize(), 0.1);
    }

    @Test
    public void canGetHorsepower(){
        assertEquals(200, engine.getHorsepower());
    }

}
