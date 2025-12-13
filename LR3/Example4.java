package LR3;

import java.util.Scanner;

public class Example4 {
    static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       System.out.print("Введите первое число: ");
        int x = in.nextInt();

       System.out.print("Введите второе число: ");
       int y = in.nextInt();

       int start = Math.min(x, y);
       int end = Math.max(x, y);

       for (int i = start; i <= end; i++) {
           System.out.println(i);
       }
   }
}
