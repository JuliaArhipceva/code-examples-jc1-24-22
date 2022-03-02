package lecture7;

import java.util.Arrays;

public class ExampleStringAndChar {
    public static void main(String[] args) {
        String str = "strstrstrstrstr";

        System.out.println(str.charAt(2)); // r

        char[] chars = new char[str.length()];
        str.getChars(1, 7, chars, 4);
        System.out.println(Arrays.toString(chars));
        System.out.println(new String(chars));

        char[] charArray = str.toCharArray();
        System.out.println(Arrays.toString(charArray));
    }
}
