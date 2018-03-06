package primeprinter;

/**
 * Created by avshalomMac on 05/03/2018.
 */
public class PrintPrimes {
    private static final int numberOfPrimes = 1000;
    final static int linesPerPage = 50;
    final static int columns = 4;

    public static void main(String[] args) {
        PrimeGenerator primeGenerator = new PrimeGenerator();
        NumberPrinter numberPrinter = new NumberPrinter(linesPerPage, columns);

        int[] primes = primeGenerator.generatePrime(numberOfPrimes);
        numberPrinter.print(primes, numberOfPrimes);
    }

}
