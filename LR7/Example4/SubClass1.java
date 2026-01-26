package LR7.Example4;

public class SubClass1 extends SuperClass {
    public String text;

    SubClass1(char symbol, String text) {
        super(symbol);
        this.text = text;
    }

    SubClass1(SubClass1 other) {
        super(other);
        this.text = other.text;
    }

    @Override
    public String toString() {
        return "SubClass1: symbol = " + symbol + ", text = " + text;
    }
}