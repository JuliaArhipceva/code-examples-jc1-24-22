package lecture8.inner;

public class OuterClassWithStaticInnerClass {
    private static String outerStaticField = "outer static field";
    private String outerField = "outer field";

    private static void outerStaticMethod() {
        System.out.println("outer static method");
    }

    private void outerMethod() {
        System.out.println("outer method");
    }

    public static class InnerClass {
        public static void innerStaticMethod() {
            System.out.println("inner static method");
            System.out.println(outerStaticField);
//            System.out.println(outerField);
            outerStaticMethod();
//            outerMethod();
        }

        public void innerMethod() {
            System.out.println("inner method");
            System.out.println(outerStaticField);
//            System.out.println(outerField);
            outerStaticMethod();
//            outerMethod();
        }
    }
}
