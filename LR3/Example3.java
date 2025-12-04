package LR3;

import java.util.Scanner;

public class Example3 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите колличество чисел: ");

        int n = in.nextInt();
        int a = 1, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
