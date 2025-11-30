package LR1;

import java.util.Scanner;

public class Example10 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input birthYear");
        int birthYear = in.nextInt();
        int currentYear;
        currentYear = 2025;

                int age = currentYear - birthYear;
        System.out.println("Your age: " + age);
        in.close();
    }
}
