package LR7.Example5;

public class Main {
    public static void main(String[] args) {

        SuperClass superClassObject = new SuperClass("Super Text");
        System.out.println("SuperClass:");
        superClassObject.display();

        SubClass1 subClassObject1 = new SubClass1("Sub1 Text", 42);
        System.out.println("\nSubClass1:");
        subClassObject1.display();

        SubClass2 subClassObject2 = new SubClass2("Sub2 Text", 'A');
        System.out.println("\nSubClass2:");
        subClassObject2.display();

        System.out.println("\nВызов переменную SuperClass через SubClass1:");
        SuperClass superRefToSub1 = new SubClass1("Poly Text1", 100);
        superRefToSub1.display();

        System.out.println("\nВызов переменную SuperClass через SubClass2:");
        SuperClass superRefToSub2 = new SubClass2("Poly Text2", 'B');
        superRefToSub2.display();
    }
}
