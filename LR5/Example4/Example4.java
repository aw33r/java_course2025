package LR5.Example4;

public class Example4 {
    public static void main(String[] args) {

        MyClass obj1 = new MyClass(10, 'B');
        System.out.println("Объект 1 (создан через int и char):");
        obj1.display();

        MyClass obj2 = new MyClass(65.1267);
        System.out.println("Объект 2 (создан через double 65.1267):");
        obj2.display();
    }
}
