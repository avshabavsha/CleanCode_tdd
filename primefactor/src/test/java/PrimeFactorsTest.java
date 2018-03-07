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
        assertPrimeFactors(5, list(5));
        assertPrimeFactors(6, list(2,3));
        assertPrimeFactors(7, list(7));
        assertPrimeFactors(8, list(2,2,2));
        assertPrimeFactors(9, list(3,3));
    }

    private void assertPrimeFactors(int n, List<Integer> primeFactors) {
        Assert.assertEquals(primeFactors, of(n));
    }

    private List<Integer> of(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int divisor = 2;
        while (n > 1) {
            while(n% divisor == 0) {
                factors.add(divisor);
                n /= divisor;
            }
            divisor ++;
        }

        if(n>1)
            factors.add(n);

        return factors;
    }

    private List<Integer> list(Integer... ints) {
        return Arrays.asList(ints);
    }
}
