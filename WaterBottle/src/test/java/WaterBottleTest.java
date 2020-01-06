import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    @Test
    public void volumeIs100(){
        WaterBottle bottle = new WaterBottle();
        assertEquals(100, bottle.getVolume());
    }

    
}
