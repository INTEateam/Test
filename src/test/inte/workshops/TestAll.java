package test.inte.workshops;

import inte.workshops.Calculate;
import inte.workshops.Earth;
import inte.workshops.Hamster;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nicklas on 2015-10-07.
 */
public class TestAll {
	private final static BigInteger HAMSTER_WEIGHT_AT_YEAR_1 = new BigInteger("440");
    private final static BigInteger HAMSTER_WEIGHT_AT_YEAR_2 = new BigInteger("1760");
	
	private final static BigInteger HAMSTER_WEIGHT = new BigInteger("55"); // grams
	
	private static final BigInteger EARTH_WEIGHT = new BigInteger("5972198600000000000000000000"); //grams
	
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

	    @Test
    public void testGetWeightEarth() throws Exception {
        assertEquals(Earth.getWeight(), EARTH_WEIGHT);
    }

    @Test
    public void testGetWeightHamster() {
        assertEquals(Hamster.getWeight(), HAMSTER_WEIGHT);
    }
	
<<<<<<< HEAD
	@Test
    public void testMain() {
        main(null);
    }

=======
>>>>>>> parent of 32479cb... testa main
}
