package timus_tasks.src.task_1327;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        if (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();

            int result = (b + 1) / 2 - a / 2;

            System.out.println(result);
        }
    }
}