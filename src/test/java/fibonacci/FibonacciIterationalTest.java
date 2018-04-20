package fibonacci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class FibonacciIterationalTest {

    FibonacciIterational fibonacciIterational;

    @Before
    public void create() {
        this.fibonacciIterational = new FibonacciIterational();
    }

    @Test
    public void test0() {
        //when
        BigDecimal result = fibonacciIterational.getN(0);
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
        Assert.assertEquals(BigDecimal.valueOf(3), fibonacciIterational.getN(4));
        Assert.assertEquals(BigDecimal.valueOf(13), fibonacciIterational.getN(7));
        Assert.assertEquals(BigDecimal.valueOf(144), fibonacciIterational.getN(12));
    }

}
