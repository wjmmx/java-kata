import agiledeveloper.kata.PrimeFactors;
import org.junit.Test;


import java.util.Collections;

import static java.util.Arrays.asList;
import static junit.framework.TestCase.assertEquals;

public class PrimeFactorTest {
    @Test
    public void oneHasNotPrimeFactors() {
        assertEquals(asList(), PrimeFactors.computeFactorsFor(1));
    }

    @Test
    public void twoHasOnlyItselfAsPrimeFactors() {
        assertEquals(asList(2), PrimeFactors.computeFactorsFor(2));
    }

    @Test
    public void threeHasOnlyItselfAsPrimeFactors() {
        assertEquals(asList(3), PrimeFactors.computeFactorsFor(3));
    }

    @Test
    public void fourHasTwoTimesTwoAsPrimeFactors() {
        assertEquals(asList(2, 2), PrimeFactors.computeFactorsFor(4));
    }

    @Test
    public void fiveHasOnlyItselfAsPrimeFactors() {

        assertEquals(asList(5), PrimeFactors.computeFactorsFor(5));
    }

    @Test
    public void sixHasTwoAndThreeAsPrimeFactors() {
        assertEquals(asList(2,3), PrimeFactors.computeFactorsFor(6));
    }

    @Test
    public void eightHasThreeTimesTwoAsPrimeFactors() {
        assertEquals(asList(2,2,2), PrimeFactors.computeFactorsFor(8));
    }

    @Test
    public void nightHasTwoTimesThreeAsPrimeFactors() {
        assertEquals(asList(3,3), PrimeFactors.computeFactorsFor(9));
    }

    @Test
    public void tenHasTwoAndFiveAsPrimeFactors() {
        assertEquals(asList(2,5), PrimeFactors.computeFactorsFor(10));
    }
}
