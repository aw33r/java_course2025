package LR6.Example9;

public class Main {
    public static void main(String[] args) {

        char[] str = {'П', 'р', 'и', 'в', 'е', 'т', '!'};

        System.out.println("Исходный массив: " + java.util.Arrays.toString(str));

        ArrayShifter.reverseArray(str);

        System.out.println("Массив после перестановки: " + java.util.Arrays.toString(str));
    }
}