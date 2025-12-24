package LR5.Example2;

public class Example2 {
    public static void main(String[] args) {

        SymbolRange myObj = new SymbolRange('A', 'D');

        String sequence = myObj.showAndReturnChars();

        System.out.println("Метод вернул строку: " + sequence);
    }
}
