package test.inte.workshops;

import inte.workshops.Earth;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Earth Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>sep 6, 2015</pre>
 */
public class EarthTest {
    private static final BigInteger EARTH_WEIGHT = new BigInteger("5972198600000000000000000000"); //grams

    /**
     * Method: getWeight()
     */
    @Test
    public void testGetWeight() throws Exception {
        assertEquals(Earth.getWeight(), EARTH_WEIGHT);
    }


} 
