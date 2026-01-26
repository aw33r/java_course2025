package LR7.Example4;

public class SuperClass {
    public char symbol;

    SuperClass(char symbol) {
        this.symbol = symbol;
    }

    SuperClass(SuperClass other) {
        this.symbol = other.symbol;
    }

    @Override
    public String toString() {
        return "SuperClass: symbol = " + symbol;
    }
}