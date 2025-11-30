package LR1;

import java.util.Scanner;

public class Example13 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input firstNumber");
        int firstNumber = in.nextInt();

        System.out.println("Input secondNumber");
        int secondNumber = in.nextInt();

        System.out.println("sum = " + (firstNumber + secondNumber) );
        in.close();
    }
}
