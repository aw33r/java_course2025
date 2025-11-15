import java.util.Scanner;

public class Example14 {
    static void main() {
            Scanner in = new Scanner(System.in);
            System.out.println("Input number");
            int number = in.nextInt();


            System.out.println("Number1 = " + (number - 1 ));
            System.out.println("Number2 = " + number);
            System.out.println("Number3 = " + (number + 1));
            System.out.println("Number4 = " + ((number) + (number + 1) + (number - 1)) * ((number) + (number + 1) + (number - 1)) );

            in.close();
    }
}
