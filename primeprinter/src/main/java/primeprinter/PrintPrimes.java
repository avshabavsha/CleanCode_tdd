package primeprinter;

/**
 * Created by avshalomMac on 05/03/2018.
 */
public class PrintPrimes {
    private static final int numberOfPrimes = 1000;

    public static void main(String[] args) {
        PrimePrinterHelper primePrinterHelper = new PrimePrinterHelper();
        int[] primes = new PrimePrinterHelper().generatePrime();
        primePrinterHelper.printNumbers(primes, numberOfPrimes);
    }

}
