import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    private Bottle bottle;

    @Before
    public void before() {
        this.bottle = new Bottle (100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, bottle.volume());
    }

    @Test
    public void canDrink() {
        assertEquals(90, bottle.drink());
    }

    @Test
    public void canDrinkMore() {
        bottle.drink();
        bottle.drink();
        bottle.drink();
        assertEquals(70, bottle.volume());
    }

    @Test
    public void emptyBottle() {
        bottle.empty();
        assertEquals(0, bottle.volume());
    }

    @Test
    public void canFillBottle() {
        bottle.drink();
        bottle.fillBottle();
        assertEquals(100, bottle.volume());
    }


}
