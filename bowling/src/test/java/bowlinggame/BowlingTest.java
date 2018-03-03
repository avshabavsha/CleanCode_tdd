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
}
