package git_142;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DigitCounterTest {

    @Test
    public void testCountDigitsPositive() {
        int result = DigitCounter.countDigits(123456);
        assertEquals(6, result);
    }

    @Test
    public void testCountDigitsZero() {
        int result = DigitCounter.countDigits(0);
        assertEquals(0, result);
    }
}
