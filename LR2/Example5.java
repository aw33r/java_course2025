package LR2;

import java.util.Scanner;

public class Example5 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число");

        int number = in.nextInt();

        int thousands = (int) (number / 1000);

        System.out.println("Количество тысяч в числе: "  + thousands);

    }
}
