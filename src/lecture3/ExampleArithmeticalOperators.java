package lecture3;

public class ExampleArithmeticalOperators {
    public static void main(String[] args) {
        int a = 17;
        int b = 21;

        int sum = a + b;
        System.out.println(sum);
        System.out.println("a + b = " + sum);

        System.out.println("a + b = " + (a + b)); // a + b = 38
        System.out.println(a - b); // -4

        System.out.println(4.5 + 7.2); // 11.7

        System.out.println(a / b); // 0
        float floatA = a; // 17.0
        System.out.println(floatA);
        System.out.println(floatA / b);
        System.out.println(a * 1.0 / b);
        System.out.println(a * 1.0f / b);
        System.out.println((float) a / b);

        System.out.println(a * b);

        System.out.println(a % b); // 17
        System.out.println(14.5 % 7.8); // 6.7
    }
}
