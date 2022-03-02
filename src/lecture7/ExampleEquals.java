package lecture7;

public class ExampleEquals {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "cat";

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.compareTo(str2)); // 0
        System.out.println(str1.compareToIgnoreCase(str2)); // 0

        String str3 = new String(new char[]{'c', 'a', 't'});

        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        System.out.println(str1.compareTo(str3)); // 0
        System.out.println(str1.compareToIgnoreCase(str3)); // 0

        String str4 = "caT";
        System.out.println(str1 == str4); // false
        System.out.println(str1.equals(str4)); // false
        System.out.println(str1.equalsIgnoreCase(str4)); // true
        System.out.println(str1.compareTo(str4)); // 32
        System.out.println(str1.compareToIgnoreCase(str4)); // 0
    }
}
