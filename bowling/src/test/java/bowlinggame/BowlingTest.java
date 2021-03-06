package bowlinggame;

/**
 * Created by avshalomMac on 03/03/2018.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BowlingTest {
    Game g;
    @Before
    public void setUp() throws Exception {
        g = new Game();
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

    private void rollStrike() {
        g.roll(10);
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }

    @Test
    public void gutterGame() throws Exception {
        rollMany(20, 0);

        Assert.assertEquals(0, g.score());
    }

    @Test
    public void allOnes() throws Exception {
        rollMany(20, 1);

        Assert.assertEquals(20, g.score());
    }

    @Test
    public void oneSpare() throws Exception {
        rollSpare();
        g.roll(3);
        rollMany(17, 0);
        Assert.assertEquals(16, g.score());
    }

    @Test
    public void oneStrike() throws Exception {
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        Assert.assertEquals(24, g.score());
    }

    @Test
    public void perfectGame() throws Exception {
        rollMany(12, 10);
        Assert.assertEquals(300, g.score());
    }
}
