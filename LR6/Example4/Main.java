package LR6.Example4;

import static LR6.Example4.DoubleFactorial.doubleFactorial;

public class Main {

    public static void main(String[] args) {
        int[] tests = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 15};

        System.out.println("Двойной факториал (цикл):");
        for (int n : tests) {
            System.out.printf("%2d!! = %d%n", n, doubleFactorial(n));
        }
    }
}