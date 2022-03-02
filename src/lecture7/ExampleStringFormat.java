package lecture7;

public class ExampleStringFormat {
    public static void main(String[] args) {
//        String template = "Today is %s, %s %d. %s, %s, %s";
//        String formatted = String.format(template, "Wednesday", "March", 2,
//                "Wednesday", "Wednesday", "Wednesday");

        String template = "Today is %1$s, %2$s %3$d. %1$s, %1$s, %1$s";
        String formatted = String.format(template, "Wednesday", "March", 2);
        System.out.println(formatted);
    }
}
