package inte.workshops;

import java.math.BigInteger;

/**
 * Created by Nicklas on 2015-09-06.
 */
public class Earth {
    private static final BigInteger EARTH_WEIGHT = new BigInteger("5972198600000000000000000000"); //grams

    public static BigInteger getWeight() {
        return EARTH_WEIGHT;
    }
}
