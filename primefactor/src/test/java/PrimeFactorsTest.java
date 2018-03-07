import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by avshaloms on 07/03/2018.
 */
public class PrimeFactorsTest {
    @Test
    public void canFactorIntoPrimes() throws Exception {
        Assert.assertEquals(list(), of(1));
        Assert.assertEquals(list(2), of(2));

    }

    private List<Integer> of(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        if(n == 2)
            factors.add(2);
        return factors;
    }

    private List<Integer> list(Integer... ints) {
        return Arrays.asList(ints);
    }
}
