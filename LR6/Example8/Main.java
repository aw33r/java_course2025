package LR6.Example8;

public class Main {
        public static void main(String[] args) {

            int[] myData = {10, 20, 30, 40, 55};

            double avg = ArrayUtils.calculateAverage(myData);

            System.out.println("Элементы массива: ");
            for (int n : myData) System.out.print(n + " ");

            System.out.println("\n---");
            System.out.printf("Среднее значение: %.2f\n", avg);
        }
    }