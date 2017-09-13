package agiledeveloper.kata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> computeFactorsFor(int num) {

        ArrayList<Integer> factors = new ArrayList<>();


        for (int primeCandidate = 2; num > 1; primeCandidate++) {

            for (; num % primeCandidate == 0; num /= primeCandidate){
                factors.add(primeCandidate);

            }


        }

        return factors;
    }
}
