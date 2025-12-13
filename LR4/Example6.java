package LR4;

import java.util.Random;
import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите количество строк :");
        int rows = scanner.nextInt();
        System.out.println("Введите количество столбцов :");
        int cols = scanner.nextInt();

        if (rows < 1 || cols < 1) {
            System.out.println("Размеры массива должны быть не менее 1x1.");
            return;
        }

        int[][] originalArray = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                originalArray[i][j] = random.nextInt(100);
            }
        }

        System.out.println("\n--- Исходный массив (" + rows + "x" + cols + ") ---");
        printMatrix(originalArray);

        int rowToDelete = random.nextInt(rows);

        int colToDelete = random.nextInt(cols);

        System.out.printf("\nСлучайно выбрано удаление строки с индексом: %d и столбца с индексом: %d\n", rowToDelete, colToDelete);

        int[][] newArray = new int[rows - 1][cols - 1];

        int newRowIndex = 0;

        for (int i = 0; i < rows; i++) {

            if (i == rowToDelete) {
                continue;
            }

            int newColIndex = 0;
            for (int j = 0; j < cols; j++) {

                if (j == colToDelete) {
                    continue;
                }
                newArray[newRowIndex][newColIndex] = originalArray[i][j];
                newColIndex++;
            }
            newRowIndex++;
        }

        System.out.println("\n--- Новый массив (" + (rows - 1) + "x" + (cols - 1) + ") ---");
        printMatrix(newArray);

    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.printf("%4d", cell);
            }
            System.out.println();
        }
    }
}

