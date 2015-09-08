package test.inte.workshops;

import inte.workshops.Hamster;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;


/**
 * Hamster Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>sep 6, 2015</pre>
 */
public class HamsterTest {
    private final static BigInteger HAMSTER_WEIGHT = new BigInteger("55"); // grams


    @Test
    public void testGetWeight() {
        assertEquals(Hamster.getWeight(), HAMSTER_WEIGHT);
    }


}
