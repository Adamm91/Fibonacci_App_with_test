package fibonacci;

        import java.math.BigDecimal;

public class FibonacciGenerator {
    public BigDecimal generate (FibonacciTypeEnum type, int n) {
        FibonacciFactory factory = new FibonacciFactory();
        FibonacciInterface fibonacci = factory.produce(type);
        return fibonacci.getN(n);
    }
}
