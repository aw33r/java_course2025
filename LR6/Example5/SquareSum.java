package LR6.Example5;

public class SquareSum {

    public static long calculateSum(int n) {
        if (n < 1) return 0;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;
        }
        return sum;
    }

    public static long verifyWithFormula(int n) {
        if (n < 1) return 0;
        return (long) n * (n + 1) * (2 * n + 1) / 6;
    }
}