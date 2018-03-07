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
        assertPrimeFactors(1, list());
        assertPrimeFactors(2, list(2));
        assertPrimeFactors(3, list(3));
        assertPrimeFactors(4, list(2,2));
    }

    private void assertPrimeFactors(int n, List<Integer> primeFactors) {
        Assert.assertEquals(primeFactors, of(n));
    }

    private List<Integer> of(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        if(n > 1) {
            if(n%2 == 0) {
                factors.add(2);
                n /= 2;
            }
            if(n>1)
                factors.add(n);
        }
        return factors;
    }

    private List<Integer> list(Integer... ints) {
        return Arrays.asList(ints);
    }
}
