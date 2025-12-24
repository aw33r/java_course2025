package LR5.Example2;

public class SymbolRange{

    char first;
    char second;

    SymbolRange(char first, char second) {
        this.first = first;
        this.second = second;
    }


    String showAndReturnChars() {
        String result = "";

        int start = Math.min(first, second);
        int end = Math.max(first, second);

        System.out.print("Символы в диапазоне: ");

        for (int i = start; i <= end; i++) {
            char currentChar = (char) i;
            System.out.print(currentChar + " ");
            result += currentChar;
        }

        System.out.println();
        return result;
    }
}
