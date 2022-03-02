package lecture7;

public class ExampleStringMethods {
    public static void main(String[] args) {
        String str = "cat";
        System.out.println(str.length()); // 3
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // false

        System.out.println("".length()); // 0
        System.out.println("".isEmpty()); // true
        System.out.println("".isBlank()); // true

        System.out.println(" ".length()); // 1
        System.out.println(" ".isEmpty()); // false
        System.out.println(" ".isBlank()); // true
    }
}
