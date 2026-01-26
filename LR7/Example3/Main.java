package LR7.Example3;

public class Main {
    public static void main(String[] args) {
        SuperClass superClassObject = new SuperClass(10);
        System.out.println(superClassObject);

        SubClass1 superClassObject2 = new SubClass1(20, 'A');
        System.out.println(superClassObject2);

        SubClass2 superClassObject3 = new SubClass2(30, 'B', "Hello World");
        System.out.println(superClassObject3);

        superClassObject3.setFields(500, 'Z', "New Value");
        System.out.println("После изменения: " + superClassObject3);
    }
}