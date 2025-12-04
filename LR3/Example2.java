package LR3;

import java.util.Scanner;

public class Example2 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели:");
        String day = in.nextLine();


        switch (day){
            case "понедельник":
                System.out.println("Это 1-й день недели");
                break;
            case "вторник":
                System.out.println("Это 2-й день недели");
                break;
            case "среда":
                System.out.println("Это 3-й день недели");
                break;
            case "четверг":
                System.out.println("Это 4-й день недели");
                break;
            case "пятница":
                System.out.println("Это 5-й день недели");
                break;
            case "суббота":
                System.out.println("Это 6-й день недели");
                break;
            case "воскресенье":
                System.out.println("Это 7-й день недели");
                break;
            default:
                System.out.println("Ошибка: такого дня недели не существует");
        }

    }
}
