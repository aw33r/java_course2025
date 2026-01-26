package LR7.Example5;

public class SubClass1 extends SuperClass {
    protected int number;

    public SubClass1(String text, int number) {
        super(text);
        this.number = number;
    }

    @Override
    public void display() {
        System.out.println("Class: " + this.getClass().getSimpleName() + ", Text: " + super.getClass().getSimpleName() + ", Number: " + number);
    }
}