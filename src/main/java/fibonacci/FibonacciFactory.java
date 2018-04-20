package fibonacci;

public class FibonacciFactory {

    public FibonacciInterface produce (FibonacciTypeEnum type) {
        switch (type) {
            case ITERATIONAL:
                return new FibonacciIterational();
            case RECURSIVE:
                return new FibonacciRecursive();
        }
        return null;
    }
}
