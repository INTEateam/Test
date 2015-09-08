package test.inte.workshops;

import inte.workshops.Calculate;
import inte.workshops.Earth;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Calculate Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>sep 6, 2015</pre>
 */
public class CalculateTest {
    private final static BigInteger HAMSTER_WEIGHT_AT_YEAR_1 = new BigInteger("440");
    private final static BigInteger HAMSTER_WEIGHT_AT_YEAR_2 = new BigInteger("1760");

    @Test
    public void testGetAmountOfHamsters() {
        assertEquals(new BigInteger("128"), Calculate.getAmountOfHamsters(3));
        assertEquals(new BigInteger("32"), Calculate.getAmountOfHamsters(2));
        assertEquals(new BigInteger("8"), Calculate.getAmountOfHamsters(1));
    }

    @Test
    public void testGetWeightOfHamsters() {
        assertEquals(new BigInteger("55"), Calculate.getWeightOfHamsters(new BigInteger("1")));
    }

    @Test
    public void testGetHamsterWeightAtYear() {
        assertEquals(HAMSTER_WEIGHT_AT_YEAR_1, Calculate.getHamsterWeightAtYear(1));
        assertEquals(HAMSTER_WEIGHT_AT_YEAR_2, Calculate.getHamsterWeightAtYear(2));
    }

    @Test
    public void testYearWhenHamstersWeighMoreThan() {
        assertEquals(3, Calculate.yearWhenHamstersWeighMoreThan(HAMSTER_WEIGHT_AT_YEAR_2));
    }


    @Test
    public void testQuestion() {
        assertEquals(43, Calculate.yearWhenHamstersWeighMoreThan(Earth.getWeight()));
    }

} 
