package LR3;

public class Example7 {
    static void main(String[] args) {

        String[] arrayString = new String[10];

        arrayString[0] = "a";
        arrayString[1] = "c";
        arrayString[2] = "e";
        arrayString[3] = "g";
        arrayString[4] = "i";
        arrayString[5] = "k";
        arrayString[6] = "m";
        arrayString[7] = "o";
        arrayString[8] = "q";
        arrayString[9] = "s";

        System.out.println();
        for (int i = 0; i < arrayString.length; i++) {
            System.out.print(arrayString[i] + " ");
        }
        System.out.println();
        for(int i = arrayString.length - 1; i >= 0; i--) {
            System.out.print(arrayString[i] + " ");
        }
    }
}
