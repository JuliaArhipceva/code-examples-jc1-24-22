package lecture3;

public class ExampleTernaryOperator {
    public static void main(String[] args) {
        int a = 7 > 5 && 2 < 1
                ? 10
                : 11;
        System.out.println(a);
    }
}
