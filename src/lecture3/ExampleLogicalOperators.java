package lecture3;

public class ExampleLogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(!a); // false

        int c = 7;
        System.out.println(c > 5 && c < 10); // true
        System.out.println(c > 5 && c < 1); // false
        System.out.println(c > 5 && c < 6); // false

        System.out.println(c > 5 || c < 10); // true
        System.out.println(c > 5 || c < 1); // true
        System.out.println(c > 5 || c < 6); // true
    }
}
