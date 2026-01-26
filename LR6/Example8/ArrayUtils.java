package LR6.Example8;

class ArrayUtils {

    public static double calculateAverage(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            System.out.println("Массив пуст или не существует.");
            return 0.0;
        }

        double sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }
}