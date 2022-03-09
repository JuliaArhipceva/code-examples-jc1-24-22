package lecture8.inner;

public class OuterClassWithInnerClass {

    private static String outerStaticField = "outer static field";
    private String outerField = "outer field";

    private static void outerStaticMethod() {
        System.out.println("outer static method");
    }

    private void outerMethod() {
        System.out.println("outer method");
    }

    public class InnerClass {
//        private static void innerStaticMethod() {
//            System.out.println("inner class private static method");
//        }

        public void innerMethod() {
            System.out.println("inner class private method");
            System.out.println(outerStaticField);
            System.out.println(outerField);
            outerStaticMethod();
            outerMethod();
        }
    }
}
