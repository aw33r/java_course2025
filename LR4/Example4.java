package LR4;

import java.util.Scanner;

public class Example4 {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер стороны треугольника (количество строк/столбцов):");
        int size = scanner.nextInt();

        char[][] triangleArray = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j <= i) {
                    triangleArray[i][j] = '*';
                } else {

                    triangleArray[i][j] = ' ';
                }
            }
        }
        System.out.println("Ваш прямоугольный треугольник:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(triangleArray[i][j] + " ");
            }

            System.out.println();
        }
    }
}