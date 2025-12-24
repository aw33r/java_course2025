package LR5.Example6;

public class Example6 {
    public static void main(String[] args) {
        System.out.println("Создаем объект с аргументами 10 и 20:");
        MinMaxClass obj = new MinMaxClass(10, 20);
        obj.display();

        System.out.println("Вызываем метод с аргументами 5 и 25:");
        obj.setValues(5, 25);
        obj.display();

        System.out.println("Вызываем метод с одним аргументом 15 (min и max не изменятся):");
        obj.setValues(15);
        obj.display();

        System.out.println("Вызываем метод с аргументами -10 и 50:");
        obj.setValues(-10, 50);
        obj.display();
    }
}
