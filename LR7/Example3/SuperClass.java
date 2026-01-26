package LR7.Example3;

public class SuperClass {
    public int number;

    SuperClass(int n) {
        this.number = n;
    }

    public void setFields(int n) {
        this.number = n;
    }

    @Override
    public String toString() {
        return "Класс SuperClass: [number = " + number + "]";
    }
}
