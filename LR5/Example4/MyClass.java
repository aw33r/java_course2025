package LR5.Example4;

public class MyClass {
    char charField;
    int intField;

    MyClass(int n, char c) {
        this.intField = n;
        this.charField = c;
    }

    MyClass(double val) {

        this.charField = (char) ((int) val);

        this.intField = (int) (val * 100) % 100;
    }

    void display() {
        System.out.println("Символьное поле: " + charField + " (код: " + (int)charField + ")");
        System.out.println("Целочисленное поле: " + intField);
        System.out.println("---------------------------");
    }
}