package LR4;

public class Example7 {
    public static void main(String[] args) {
        int size = 9;
        int[][] matrix = new int[size][size];
        int count = 1;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = count++;
                }
            } else {
                for (int j = size - 1; j >= 0; j--) {
                    matrix[i][j] = count++;
                }
            }
        }
        System.out.println("Матрица 9x9 'змейкой':");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size;  ) {
                System.out.printf("%3d ", matrix[i][j]);
                j++;
            }
            System.out.println();
        }
    }
}