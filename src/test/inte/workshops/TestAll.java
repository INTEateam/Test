package test.inte.workshops;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value = Suite.class)
@SuiteClasses(value = {EarthTest.class,
        CalculateTest.class,
        HamsterTest.class
})

/**
 * Created by Nicklas on 2015-09-06.
 */
public class TestAll {
}
