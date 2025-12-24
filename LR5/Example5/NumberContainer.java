package LR5.Example5;


public class NumberContainer {

    private int value;

    public NumberContainer() {
        this.value = 0;
    }

    public NumberContainer(int num) {
        if (num > 100) {
            this.value = 100;
        } else {
            this.value = num;
        }
    }

    public void setValue() {
        this.value = 0;
    }

    public void setValue(int num) {
        if (num > 100) {
            this.value = 100;
        } else {
            this.value = num;
        }
    }

    public int getValue() {
        return this.value;
    }
}