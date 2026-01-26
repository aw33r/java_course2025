package LR6.Example3;

public class Main {
        public static void main(String[] args) {

    System.out.println("Анализ набора (10, 20, 30, 5, 15):");
    System.out.println("Максимум: " + StatUtils.findMax(10, 20, 30, 5, 15));
    System.out.println("Минимум: " + StatUtils.findMin(10, 20, 30, 5, 15));
    System.out.println("Среднее: " + StatUtils.findAverage(10, 20, 30, 5, 15));

    System.out.println();

    int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println("Анализ массива от 1 до 10:");
    System.out.println("Максимум: " + StatUtils.findMax(data));
    System.out.println("Среднее: " + StatUtils.findAverage(data));
}
}