package LR6.Example10;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {

        int[] arrayInt = getMacAndMinValue(12310, 22310, 2221230, 500);
        System.out.println(Arrays.toString(arrayInt));
    }

    public static int[] getMacAndMinValue(int ... v) {

        Arrays.sort(v);

        int[] arrayInt = new int[2];

        arrayInt[0] = v[0];
        arrayInt[1] = v[v.length - 1];

        return arrayInt;
    }
}
