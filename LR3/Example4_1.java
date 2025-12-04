package LR3;

import java.util.Scanner;

public class Example4_1 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int x = in.nextInt();

        System.out.print("Введите второе число: ");
        int y = in.nextInt();

        int current = Math.min(x, y);
        int end = Math.max(x, y);

        while (current <= end) {
            System.out.println(current);
            current++;
        }
    }
}