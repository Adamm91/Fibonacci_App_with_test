import fibonacci.FibonacciFactory;
import fibonacci.FibonacciGenerator;
import fibonacci.FibonacciTypeEnum;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        int n = 10;

        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        BigDecimal result = fibonacciGenerator.generate(FibonacciTypeEnum.ITERATIONAL, n);
        System.out.println("WYRAZ NR " + n + "");
    }
}
