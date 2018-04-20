package fibonacci;

import java.math.BigDecimal;

public class FibonacciRecursive implements FibonacciInterface{

    public BigDecimal getN(int n) {
        return n <= 0 ? BigDecimal.valueOf(0) : n == 1 ? BigDecimal.valueOf(1) :
                getN(n - 1).add(getN(n - 2));
    }
}
