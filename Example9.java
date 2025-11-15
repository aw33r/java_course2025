import java.util.Scanner;

public class Example9 {
    public static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input monthName: ");
        String monthName = in.nextLine();

        System.out.println("Input days: ");
        int days = in.nextInt();
        System.out.println("days: " + days);
        System.out.println("monthName: " + monthName);
        in.close();
    }
}
