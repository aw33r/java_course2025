package timus_tasks.src.task_1068;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        } else {
            for (int i = 1; i >= n; i--) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}