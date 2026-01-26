package LR6.Example7;

class ArrayConverter {

    public static int[] getCharCodes(char[] chars) {
        if (chars == null) {
            return null;
        }

        int[] codes = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {

            codes[i] = chars[i];
        }

        return codes;
    }
}