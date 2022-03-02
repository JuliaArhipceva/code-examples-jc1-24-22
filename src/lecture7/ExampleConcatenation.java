package lecture7;

public class ExampleConcatenation {
    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        System.out.println(a + " + " + b + " = " + a + b);
        System.out.println(a + " + " + b + " = " + (a + b));

        System.out.println("" + a + b);

        String concat = "cat".concat(" and dog");
        System.out.println(concat);

        String joinedStr = String.join(", ", "cat", "dog", "table");
        System.out.println(joinedStr);
    }
}
