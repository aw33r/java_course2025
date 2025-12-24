package LR5.Example5;

public class Example5 {
    public static void main(String[] args) {

        NumberContainer obj1 = new NumberContainer();
        System.out.println("Создан конструктор без аргументов: " + obj1.getValue());

        NumberContainer obj2 = new NumberContainer(50);
        System.out.println("Создан конструктор с аргументом(значение <= 100): " + obj2.getValue());

        NumberContainer obj3 = new NumberContainer(150);
        System.out.println("Создан конструктор с аргументом(значение > 100): " + obj3.getValue());

        obj1.setValue();
        System.out.println("Изменение значения через метод без аргументов: " + obj1.getValue());

        obj1.setValue(75);
        System.out.println("Изменение значения через метод с аргументом (<= 100): " + obj1.getValue());

        obj1.setValue(200);
        System.out.println("Изменение значения через метод с аргументом (> 100): " + obj1.getValue());


    }

}

