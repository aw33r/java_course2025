package LR4;

public class Example1 {
    static void main(String[] args) {

        int width = 23;
        int height = 11;

        char symbol = '*';

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {

                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
