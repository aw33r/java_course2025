package LR6.Example2;

public class Counter {
    private static int count = 0;

    public static void showAndIncrement() {
        System.out.println("Текущее значение: " + count);
        count++;
    }
}