package LR4;

import java.util.Scanner;

public class Example3 {

 static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите количество строк для прямоугольника:");
    int rows = scanner.nextInt();

    System.out.println("Введите количество столбцов для прямоугольника:");
    int columns = scanner.nextInt();

    int[][] rectangle = new int[rows][columns];


    for (int i = 0; i < rows; i++) {

        for (int j = 0; j < columns; j++) {
            rectangle[i][j] = 2;
        }
    }

    System.out.println("Ваш прямоугольник из цифр 2:");

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {

            System.out.print(rectangle[i][j] + " ");
        }

        System.out.println();
    }
}
}