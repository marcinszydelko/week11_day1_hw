import org.junit.Test;

import java.util.prefs.BackingStoreException;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    @Test
    public void volumeIs100(){
        WaterBottle bottle = new WaterBottle();
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canDrink(){
        WaterBottle bottle = new WaterBottle();
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void canEmptyTheBottle(){
        WaterBottle bottle = new WaterBottle();
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void canFillBottle(){
        WaterBottle bottle = new WaterBottle();
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }

}
