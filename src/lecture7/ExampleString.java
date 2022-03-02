package lecture7;

public class ExampleString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str);

        byte[] ascii = {1, 36, 87, 65, 34, 78, 45};
        System.out.println(new String(ascii, -1));

        System.out.println(new String(ascii));
    }
}
