package inte.workshops;

import java.math.BigInteger;

/**
 * Created by Nicklas on 2015-09-06.
 */
public class Calculate {
    private final static BigInteger STARTING_AMOUNT = new BigInteger("2");
    private final static BigInteger GROWTH_RATE = new BigInteger("4");

    public static BigInteger getAmountOfHamsters(int year) {
        // ( 2(4)^t ) * 55 =
        // (STARTING_AMOUNT(GROWTH_RATE)^years)
        BigInteger expPart = GROWTH_RATE.pow(year);
        BigInteger amount = STARTING_AMOUNT.multiply(expPart);
        return amount;
    }

    public static BigInteger getWeightOfHamsters(BigInteger hamsters) {
        BigInteger hamsterWeight = Hamster.getWeight();
        return hamsterWeight.multiply(hamsters); //Weight in grams
    }

    public static BigInteger getHamsterWeightAtYear(int year) {
        return getWeightOfHamsters(getAmountOfHamsters(year));
    }

    public static int yearWhenHamstersWeighMoreThan(BigInteger weight) {
        int year = 0;
        BigInteger currentWeight = new BigInteger("0");

        while (weight.compareTo(currentWeight) >= 0) {
            year = year + 1;
            currentWeight = getHamsterWeightAtYear(year);
        }
        return year;
    }


}
