package LR3;

import java.util.Scanner;

public class Example3_1 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите колличество чисел: ");

        int n = in.nextInt();
        int count = 0;
        int a = 1, b = 1;

        while (count < n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
    }
}