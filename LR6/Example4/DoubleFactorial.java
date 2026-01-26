package LR6.Example4;

public class DoubleFactorial {


    public static long doubleFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Отрицательное число: " + n);
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;

        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }

        return result;
    }
}
