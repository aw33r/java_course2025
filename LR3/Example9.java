package LR3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Example9 {
    static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите размер массива");

        int size = id.nextInt();

        System.out.println("Размер массива равен" + size);

        int[] nums = new int[size];

        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10);
            System.out.println("Элемент массива [" + i + "] + " + nums[i]);}

        {int minValue = nums[0];
            int minIndex = 0;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < minValue) {
                    minValue = nums[i];
                }
            }
            System.out.println("Минимальное значение: " + minValue);
            System.out.println("Минимальный индекс: " );

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == minValue) {
                    System.out.println(i + " ");

                }
            }
        }
    }
}