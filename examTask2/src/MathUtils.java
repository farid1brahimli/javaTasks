public class MathUtils {

    public static int divide(int a, int b ) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Division by zero");
        }
        return a / b;
    }
}
