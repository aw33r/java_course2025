package LR3;

public class Example8 {
    static void main(String[] args) {

        char[] consonants = new char[10];

        int index = 0;

        for (char c = 'A'; c <= 'Z'; c++) {
            if (c == 'A' || c == 'E' || c == 'I') {
                continue;
            }

            if (index < consonants.length) {
                consonants[index] = c;
                index++;
            }else{
                break;
            }
        }

        System.out.println();
        for (char letter : consonants){
            System.out.print(letter + " ");
        }
    }
}
