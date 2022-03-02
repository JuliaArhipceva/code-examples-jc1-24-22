package lecture7;

public class ExampleStringParse {
    public static void main(String[] args) {
        String str = "7.7";

//        int parsedInt = Integer.parseInt(str);
//        System.out.println(parsedInt * 2);

        float parsedFloat = Float.parseFloat(str);
        System.out.println(parsedFloat * 2);
//        System.out.println(str * 2);

        boolean parsedBoolean = Boolean.parseBoolean("hbdfgesdv");
        System.out.println(parsedBoolean);

    }
}
