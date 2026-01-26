package LR6.Example5;

import static LR6.Example5.SquareSum.calculateSum;
import static LR6.Example5.SquareSum.verifyWithFormula;

public class Main {
    public static void main(String[] args) {
        int n = 6;

        long result = calculateSum(n);
        long formulaResult = verifyWithFormula(n);

        System.out.println("Расчет для n = " + n);
        System.out.println("Результат через цикл: " + result);
        System.out.println("Результат по формуле: " + formulaResult);

        if (result == formulaResult) {
            System.out.println("Проверка пройдена успешно.");
        }
    }
}
