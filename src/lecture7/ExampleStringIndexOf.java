package lecture7;

public class ExampleStringIndexOf {
    public static void main(String[] args) {
        String str = "strstrstrstrstr";
        String substring = "str";
        String nonSubstring = "vghhnxs";

        System.out.println(str.indexOf(116)); // 1
        System.out.println(str.lastIndexOf(116)); // 13
        System.out.println(str.indexOf(substring)); // 0
        System.out.println(str.lastIndexOf(substring)); // 12

        System.out.println(str.startsWith(substring)); // true
        System.out.println(str.startsWith(nonSubstring)); // false
        System.out.println(str.endsWith(substring)); // true
        System.out.println(str.endsWith(nonSubstring)); // false

        System.out.println(str.regionMatches(3, substring, 0, 3)); // true
    }
}
