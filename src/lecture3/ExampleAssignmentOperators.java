package lecture3;

public class ExampleAssignmentOperators {
    public static void main(String[] args) {
        int a = 17;
        System.out.println(a);

        a = 5 + 7 * 3 - 4; // 22
        System.out.println(a);

        a = a * 5; // 110
        System.out.println(a);

        a = 22;
        a *= 5; // 110
        System.out.println(a);

        a = 7;
        a *= 3 + 2; // 35
        System.out.println(a);

        a = (5 + 7) - 3 * 4; // 0
        // 12 - 3 * 4
        System.out.println(a);
    }
}
