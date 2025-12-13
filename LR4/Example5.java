package LR4;

import java.util.Random;
import java.util.Scanner;

public class Example5  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите количество строк исходного массива:");
        int originalRows = scanner.nextInt();

        System.out.println("Введите количество столбцов исходного массива:");
        int originalColumns = scanner.nextInt();

        int[][] originalMatrix = new int[originalRows][originalColumns];

        for (int i = 0; i < originalRows; i++) {
            for (int j = 0; j < originalColumns; j++) {
                originalMatrix[i][j] = random.nextInt(100);
            }
        }
        System.out.println("\n--- Исходный массив (" + originalRows + "x" + originalColumns + ") ---");
        printMatrix(originalMatrix);

        int[][] transposedMatrix = new int[originalColumns][originalRows];

        for (int i = 0; i < originalRows; i++) {
            for (int j = 0; j < originalColumns; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }

        System.out.println("\n--- Транспонированный массив (" + originalColumns + "x" + originalRows + ") ---");
        printMatrix(transposedMatrix);

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