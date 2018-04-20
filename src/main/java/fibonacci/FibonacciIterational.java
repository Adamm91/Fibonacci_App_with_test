package fibonacci;

import java.math.BigDecimal;

public class FibonacciIterational implements FibonacciInterface {

    public BigDecimal getN (int n) {
        if (n <= 0) return BigDecimal.valueOf(0);
        if (n == 1) return BigDecimal.valueOf(1);
        int first = 0;
        int second = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return BigDecimal.valueOf(result);
    }
}
