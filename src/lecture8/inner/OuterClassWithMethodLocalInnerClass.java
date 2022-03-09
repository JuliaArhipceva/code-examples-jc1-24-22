package lecture8.inner;

public class OuterClassWithMethodLocalInnerClass {
    private static String outerStaticField = "outer static field";
    private String outerField = "outer field";

    public void method() {
        String message = "message";
        class InnerClass {
            // private static String innerStaticField;
            private String innerField;

            public void innerMethod() {
                System.out.println(outerStaticField);
                System.out.println(outerField);
                System.out.println(message);
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.innerMethod();
    }

//    public void anotherMethod() {
//        method.InnerClass innerClass
//    }
}
