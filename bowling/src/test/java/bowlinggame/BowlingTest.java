package bowlinggame;

/**
 * Created by avshalomMac on 03/03/2018.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingTest {
    Game g;
    @Before
    public void setUp() throws Exception {
        g = new Game();
    }

    @Test
    public void canRoll() throws Exception {
        g.roll(0);
    }

    @Test
    public void gutterGame() throws Exception {
        int pins = 0;
        int n = 20;
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }

        Assert.assertEquals(0, g.score());
    }

    @Test
    public void allOnes() throws Exception {
        for (int i = 0; i < 20; i++) {
            g.roll(1);
        }

        Assert.assertEquals(20, g.score());
    }
}
