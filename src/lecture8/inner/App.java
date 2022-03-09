package lecture8.inner;

public class App {
    public static void main(String[] args) {
        OuterClassWithInnerClass outerClassWithInnerClass =
                new OuterClassWithInnerClass();
        OuterClassWithInnerClass.InnerClass innerClass =
                outerClassWithInnerClass.new InnerClass();
        innerClass.innerMethod();

        System.out.println("--------------------------");

        OuterClassWithStaticInnerClass.InnerClass.innerStaticMethod();
        OuterClassWithStaticInnerClass.InnerClass innerStaticClass =
                new OuterClassWithStaticInnerClass.InnerClass();
        innerStaticClass.innerMethod();

        System.out.println("--------------------------");

        OuterClassWithMethodLocalInnerClass outerClassWithMethodLocalInnerClass =
                new OuterClassWithMethodLocalInnerClass();
        outerClassWithMethodLocalInnerClass.method();

    }
}
