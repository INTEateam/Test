package inte.workshops;

import java.math.BigInteger;

/**
 * Created by Nicklas on 2015-09-06.
 */
public class Hamster {
    private final static BigInteger HAMSTER_WEIGHT = new BigInteger("55"); // grams

    public static BigInteger getWeight() {
        return HAMSTER_WEIGHT;
    }
}
