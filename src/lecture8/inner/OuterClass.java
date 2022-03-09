package lecture8.inner;

public class OuterClass {
    private static final String field = "field";

    public static void main(String[] args) {
        Interface interfaceObject = new Interface() {
            @Override
            public void method() {
                System.out.println(field);
            }
        };
        interfaceObject.method();
    }
}
