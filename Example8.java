import java.util.Scanner;

public class Example8 {
    public static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input weekDay: ");
        String weekDay = in.nextLine();

        System.out.println("Input monthName: ");
        String monthName = in.nextLine();

        System.out.println("Input monthDay: ");
        String monthDay = in.nextLine();

        System.out.println("weekDay: " + weekDay);
        System.out.println("monthName: " + monthName);
        System.out.println("monthDay: " + monthDay);
        in.close();
    }
}