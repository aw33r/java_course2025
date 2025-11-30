package LR1;

import java.util.Scanner;

public class Example12 {
    static void main() {
    Scanner in = new Scanner(System.in);
    System.out.println("Input age");
    int age = in.nextInt();
    int currentYear;
    currentYear = 2025;

    int birthYear = currentYear - age;
    System.out.println("Your birthyear: " + birthYear);
    in.close();
}
}


