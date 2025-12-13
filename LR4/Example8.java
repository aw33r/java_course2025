package LR4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String value = in.nextLine();

        System.out.println("Введите ключ для шифрования");
        int key = in.nextInt();

        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];

        for(int i = 0; i < chars.length; i++){
            ints[i] = chars[i] + key;
        }

        for(int i = 0; i < chars.length; i++){
            chars[i] = (char) ints[i];
        }

        System.out.println("Текст после преобразования" + Arrays.toString(chars));

        String response;
        do {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            response = in.nextLine().trim().toLowerCase();


            if (response.equals("y")) {

                System.out.println("Текст после обратного преобразования: " + value);
                break;
            } else if (response.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ.");
            }
        } while (true);

    }
}

