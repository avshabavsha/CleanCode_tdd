package primeprinter;

/**
 * Created by avshalomMac on 05/03/2018.
 */
class PrimeGenerator {
    final int ordmax = 30;

    private int pagenumber;
    private int pageoffset;
    private int rowoffset;
    private int column;
    private int candidate;
    private int primeindex;
    private boolean possiblyPrime;
    private int ord;
    private int square;
    private int n;
    private int multiples[] = new int[ordmax + 1];

    public int[] generatePrime(int numberOfPrimes) {
        int primes[] = new int[numberOfPrimes + 1];
        n =0 ;

        candidate = 1;
        primeindex = 1;
        primes[1] = 2;
        ord = 2;
        square = 9;

        while (primeindex < numberOfPrimes) {
            findNextPrime(primes);
        }

        return primes;
    }

    private void findNextPrime(int[] primes) {
        do {
            candidate = candidate + 2;
            if (candidate == square) {
                ord = ord + 1;
                square = primes[ord] * primes[ord];
                multiples[ord - 1] = candidate;
            }
            n = 2;
            possiblyPrime = true;
            while (n < ord && possiblyPrime) {
                while (multiples[n] < candidate)
                    multiples[n] = multiples[n] + primes[n] + primes[n];
                if (multiples[n] == candidate)
                    possiblyPrime = false;
                n = n + 1;
            }
        } while (!possiblyPrime);
        primeindex = primeindex + 1;
        primes[primeindex] = candidate;
    }

    public void printNumbers(int numbers[], int numberOfNumbers) {

    }

}
