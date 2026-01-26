package LR7.Example4;

public class Main {
    public static void main(String[] args) {

        SubClass2 original = new SubClass2('A', "Hello", 1234);
        System.out.println("Оригинал: " + original);

        SubClass2 copy = new SubClass2(original);
        System.out.println("Копия:    " + copy);

    }
}