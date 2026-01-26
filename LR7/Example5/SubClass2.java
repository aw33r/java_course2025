package LR7.Example5;

public class SubClass2 extends SuperClass {
    protected char symbol;

    public SubClass2(String text, char symbol) {
        super(text);
        this.symbol = symbol;
    }

    @Override
    public void display() {
        System.out.println("Class: " + this.getClass().getSimpleName() + ", Text: " + super.getClass().getSimpleName()  + ", Symbol: " + symbol);
    }
}