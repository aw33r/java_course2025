package LR1;

import java.util.Scanner;

public class example11 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input birthYear");
        int birthYear = in.nextInt();
        int currentYear;
        currentYear = 2025;
        int age = currentYear - birthYear;
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        in.close();
    }
}