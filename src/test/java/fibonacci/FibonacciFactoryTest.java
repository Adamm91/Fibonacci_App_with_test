package fibonacci;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciFactoryTest {

    private FibonacciFactory fibonacciFactory;

    @Before
    public void create() {
        this.fibonacciFactory = new FibonacciFactory();
    }

    @Test
    public void produceIterational () {
        FibonacciInterface produce = fibonacciFactory.produce(FibonacciTypeEnum.ITERATIONAL);
        Assert.assertTrue(produce instanceof FibonacciInterface);
        Assert.assertTrue(produce instanceof FibonacciIterational);
        Assert.assertFalse(produce instanceof FibonacciRecursive);
    }

    @Test
    public void produceRecursive () {
        FibonacciInterface produce = fibonacciFactory.produce(FibonacciTypeEnum.RECURSIVE);
        Assert.assertTrue(produce instanceof FibonacciInterface);
        Assert.assertTrue(produce instanceof FibonacciRecursive);
        Assert.assertFalse(produce instanceof FibonacciIterational);

    }

}
