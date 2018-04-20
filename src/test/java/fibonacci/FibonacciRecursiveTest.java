package fibonacci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;


public class FibonacciRecursiveTest {

    FibonacciRecursive fibonacciRecursive;

    @Before
    public void create() {
        this.fibonacciRecursive = new FibonacciRecursive();
    }

    @Test
    public void test0() {
        //when
       BigDecimal result = fibonacciRecursive.getN(0);
        // then
        Assert.assertEquals(BigDecimal.valueOf(0), result);
    }

    @Test
    public void testMinus() {
        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
        BigDecimal result = fibonacciRecursive.getN(-7);
        Assert.assertEquals(BigDecimal.valueOf(0), result);
    }

    @Test
    public void test() {
        Assert.assertEquals(BigDecimal.valueOf(3), fibonacciRecursive.getN(4));
        Assert.assertEquals(BigDecimal.valueOf(13), fibonacciRecursive.getN(7));
        Assert.assertEquals(BigDecimal.valueOf(144), fibonacciRecursive.getN(12));
    }

}
