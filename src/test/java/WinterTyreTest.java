import Tyres.Tyre;
import Tyres.WinterTyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WinterTyreTest {

    WinterTyre winterTyre;

    @Before
    public void before(){
        winterTyre = new WinterTyre(18);
    }

    @Test
    public void canGetSize(){
        assertEquals(18, winterTyre.getSize());
    }

}
