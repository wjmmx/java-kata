package agiledeveloper.kata;

public class GeneratingPrimes {


    private int s;
    private static int sizeOfArray;
    private static boolean[] isPrime;
    private static int primeCounter;

    public static int[] generatePrimeNumbers(int maxValue) {

        if (maxValue < 2) return new int[0]; // the only valid case

        initializeSieve(maxValue);

        sieve();

        return loadPrimes(); // return the primes

    }

    private static int[] loadPrimes() {
        int i;
        int j;
        primeCounter=0;
        for (i = 0; i < sizeOfArray; i++) {
            if (isPrime[i])
                primeCounter++; // bump count.
        }

        int[] primes = new int[primeCounter];

        // move the primes into the result
        for (i = 0, j = 0; i < sizeOfArray; i++) {
            if (isPrime[i]) // if prime
                primes[j++] = i;
        }
        return primes;
    }

    private static void sieve() {
        for (int i = 2; i < Math.sqrt(sizeOfArray) + 1; i++) {

            if (isPrime[i]) // if i is uncrossed, cross its multiples.
            {
                for (int j = 2 * i; j < sizeOfArray; j += i)
                    isPrime[j] = false; // multiple is not prime
            }
        }

        //System.out.println(primeCounter);
    }

    private static void initializeSieve(int maxValue) {
        // declarations
        // size of array
        sizeOfArray = maxValue + 1;
        isPrime = new boolean[sizeOfArray];

        // initialize array to true.
        for (int i = 0; i < sizeOfArray; i++)
            isPrime[i] = true;

        // get rid of known non-primes
        isPrime[0] = isPrime[1] = false;
    }
}
