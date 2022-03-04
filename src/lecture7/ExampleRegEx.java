package lecture7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleRegEx {
    public static void main(String[] args) {
        String str = "strstrstrstrstr";
        String regex = "(str){5}";

        System.out.println(str.matches(regex)); // true
        System.out.println(str.matches("(str){3}")); // false
        System.out.println(str.matches("(str){3}.")); // false
        System.out.println("strstrstrA".matches("(str){3}.")); // true
        System.out.println(str.matches("(str){3}.*")); // true
        System.out.println(str.matches("\\b(str){3}\\B")); // false

        // check if string is phone number
        // +375(29|33|44|25)

        System.out.println("PHONE NUMBER");
        String phoneNumberRegex = "(\\+375)(29|33|44|25)[1-9]\\d{6}";
        Pattern pattern = Pattern.compile(phoneNumberRegex);
        Matcher matcher = pattern.matcher("+375331234567");
        System.out.println(matcher.matches()); // true
        System.out.println(pattern.matcher("+375330234567").matches()); // false
        System.out.println(pattern.matcher("+37533123456").matches()); // false
        System.out.println(pattern.matcher("+3753312345678").matches()); // false
        System.out.println(pattern.matcher("375331234567").matches()); // false
        System.out.println(pattern.matcher("+385331234567").matches()); // false
        System.out.println(pattern.matcher("+375221234567").matches()); // false

    }
}
