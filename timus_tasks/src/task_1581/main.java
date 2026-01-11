package timus_tasks.src.task_1581;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (!in.hasNextInt()) return;
        int n = in.nextInt();

        int current = in.nextInt();
        int count = 1;

        for (int i = 1; i < n; i++) {
            int next = in.nextInt();
            if (next == current) {
                count++;
            } else {
                System.out.print(count + " " + current + " ");
                current = next;
                count = 1;
            }
        }

        System.out.print(count + " " + current);
    }
}