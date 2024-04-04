package git_142;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddtwoNumbersTest {

    @Test
    public void testAddition() {
        AddTwoNumbers add = new AddTwoNumbers();
        int result = add.addIntegers(5, 10);
        assertEquals(15, result);
    }

    @Test
    public void testAdditionNegative() {
        AddTwoNumbers add = new AddTwoNumbers();
        int result = add.addIntegers(-5, 10);
        assertEquals(5, result);
    }
}
