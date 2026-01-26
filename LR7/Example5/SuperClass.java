package LR7.Example5;

public class SuperClass {
    private String text;

    public SuperClass(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println("Class: " + this.getClass().getSimpleName() + ", Text: " + text);
    }
}