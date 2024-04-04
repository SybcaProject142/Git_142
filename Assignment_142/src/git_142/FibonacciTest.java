package git_142;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacciTerm() {
        Fibonacci fib = new Fibonacci();
        int result = fib.fibonacci(6); // Testing the 6th term of Fibonacci series
        assertEquals(8, result);
    }

    @Test
    public void testFibonacciZero() {
        Fibonacci fib = new Fibonacci();
        int result = fib.fibonacci(0); // Testing the first term of Fibonacci series
        assertEquals(0, result);
    }
}
