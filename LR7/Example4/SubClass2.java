package LR7.Example4;

public class SubClass2 extends SubClass1 {
    public int number;

    SubClass2(char symbol, String text, int number) {
        super(symbol, text);
        this.number = number;
    }
    SubClass2(SubClass2 other) {
        super(other);
        this.number = other.number;
    }

    @Override
    public String toString() {
        return "Sub: symbol = " + symbol + ", text = " + text + ", number = " + number;
    }
}

