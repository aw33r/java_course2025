package LR7.Example3;

public class SubClass2 extends SubClass1 {
    public String text;

    SubClass2(int n, char s, String t) {
        super(n, s);
        this.text = t;
    }

    public void setFields(int n, char s, String t) {
        super.setFields(n, s);
        this.text = t;
    }

    @Override
    public String toString() {
        return "Класс SubClass2: [number = " + number + ", symbol = '" + symbol + "', text = \"" + text + "\"]";
    }
}