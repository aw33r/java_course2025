package LR1;

import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        IO.println("Input firstName: ");
        String firstName = in.nextLine();

        IO.println("Input name: ");
        String name = in.nextLine();

        IO.println("Input secondName: ");
        String secondName = in.nextLine();

        IO.println("firstName: " + firstName);
        IO.println("name: " + name);
        IO.println("secondName: " + secondName);
        in.close();
    }
}