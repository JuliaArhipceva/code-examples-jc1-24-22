package lecture7;

public class ExampleToStringAndValueOf {
    public static void main(String[] args) {
        Cat cat = new Cat("Fluffy", 3);
        String catToString = cat.toString();
        System.out.println(catToString);

        System.out.println(new Cat("Tom", 7));

        String strFromInt = String.valueOf(7.7);
        System.out.println(strFromInt);
    }
}
