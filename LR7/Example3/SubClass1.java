package LR7.Example3;

public class SubClass1 extends SuperClass {
    public char symbol;

    SubClass1(int n, char s) {
        super(n);
        this.symbol = s;
    }

    public void setFields(int n, char s) {
        super.setFields(n);
        this.symbol = s;
    }

    @Override
    public String toString() {
        return "Класс SubClass1: [number = " + number + ", symbol = '" + symbol + "']";
    }
}