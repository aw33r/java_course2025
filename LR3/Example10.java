package LR3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example10 {
    static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите размер массива");

        int size = id.nextInt();

        System.out.println("Размер массива равен: " + size);

        int[] array = new int[size];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("Отсортированный массив по убыванию: ");
        System.out.println(Arrays.toString(array));
    }
}
