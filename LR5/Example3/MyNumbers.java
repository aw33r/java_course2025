package LR5.Example3;

public class MyNumbers {

    public int num1;
    public int num2;


    public MyNumbers () {
        this.num1 = 0;
        this.num2 = 0;
        System.out.println("Создан объект без аргументов (0, 0)");
    }


    public MyNumbers (int n) {
        this.num1 = n;
        this.num2 = n;
        System.out.println("Создан объект с одним аргументом (" + n + ")");
    }

    public MyNumbers (int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
        System.out.println("Создан объект с двумя аргументами (" + n1 + ", " + n2 + ")");
    }

    public void show() {
        System.out.println("Значения: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("------------------------------------");
    }
}