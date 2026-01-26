package LR6.Example7;

public class Main {
    public static void main(String[] args) {

        char[] myChars = {'П', 'р', 'и', 'в', 'е', 'т', '!'};

        int[] myCodes = ArrayConverter.getCharCodes(myChars);

        System.out.println("Символы -> Коды (Unicode):");
        for (int i = 0; i < myChars.length; i++) {
            System.out.println("'" + myChars[i] + "' = " + myCodes[i]);
        }
    }
}