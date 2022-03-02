package lecture7;

public class ExampleStringProcessing {
    public static void main(String[] args) {
        String str = "strstrstrstrstr";
        String substring = "str";
        String nonSubstring = "vghhnxs";

        System.out.println(str);
        System.out.println(str.replace('t', '0'));
        System.out.println(str);

        System.out.println(str.replace(substring, nonSubstring));
        System.out.println(str);

        System.out.println(str.replace("t", nonSubstring));
        System.out.println(str);

        System.out.println(str.replace("st", ""));
        System.out.println(str);

        System.out.println(str.substring(1, 4)); // trs
        System.out.println(str.substring(7)); // trstrstr
//        System.out.println(str.substring(674847));

        System.out.println("str".toLowerCase());
        System.out.println("stR".toLowerCase());
        System.out.println("STR".toLowerCase());

        System.out.println("str".toUpperCase());
        System.out.println("stR".toUpperCase());
        System.out.println("STR".toUpperCase());

        System.out.println("       cat        ".trim());
        System.out.println("            ".trim());
        System.out.println("asa            gch".trim());
    }
}
