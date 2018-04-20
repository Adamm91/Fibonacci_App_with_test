package fibonacci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;


public class FibonacciGeneratorTest {

    private FibonacciGenerator generator;

    @Before
    public void create() {
        this.generator = new FibonacciGenerator();
    }

    @Test
    public void test0() {
        //when
        BigDecimal result = generator.generate(FibonacciTypeEnum.ITERATIONAL, 0);
        BigDecimal result1 = generator.generate(FibonacciTypeEnum.RECURSIVE, 0);
        // then
        Assert.assertEquals(BigDecimal.valueOf(0), result);
        Assert.assertEquals(BigDecimal.valueOf(0), result1);
    }

    @Test
    public void testMinus() {
        BigDecimal result = generator.generate(FibonacciTypeEnum.ITERATIONAL, -7);
        BigDecimal result1 = generator.generate(FibonacciTypeEnum.RECURSIVE, -7);
        Assert.assertEquals(BigDecimal.valueOf(0), result);
        Assert.assertEquals(BigDecimal.valueOf(0), result1);
    }

    @Test
    public void test() {
        Assert.assertEquals(BigDecimal.valueOf(3), generator.generate(FibonacciTypeEnum.RECURSIVE, 4));
        Assert.assertEquals(BigDecimal.valueOf(3), generator.generate(FibonacciTypeEnum.ITERATIONAL, 4));
        Assert.assertEquals(BigDecimal.valueOf(13), generator.generate(FibonacciTypeEnum.RECURSIVE, 7));
        Assert.assertEquals(BigDecimal.valueOf(13), generator.generate(FibonacciTypeEnum.ITERATIONAL, 7));
        Assert.assertEquals(BigDecimal.valueOf(144), generator.generate(FibonacciTypeEnum.RECURSIVE, 12));
        Assert.assertEquals(BigDecimal.valueOf(144), generator.generate(FibonacciTypeEnum.ITERATIONAL, 12));
    }

}