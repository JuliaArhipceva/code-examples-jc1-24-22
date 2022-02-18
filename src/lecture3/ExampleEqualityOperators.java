package lecture3;

public class ExampleEqualityOperators {
    public static void main(String[] args) {
        int a = 17;
        int b = 21;

        boolean booleanVar = a == b;
        System.out.println(booleanVar);

        System.out.println(a == b); // false
        System.out.println(a == a); // true

        System.out.println(a != b); // true
        System.out.println(a != a); // false

        System.out.println(a > b); // false
        System.out.println(a > a); // false

        System.out.println(a < b); // true
        System.out.println(a < a); // false

        System.out.println(a >= b); // false
        System.out.println(a >= a); // true

        System.out.println(a <= b); // true
        System.out.println(a <= a); // true

    }
}
