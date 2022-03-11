package lecture9.generics;

public class App {
    public static void main(String[] args) {
        GenericClass<String, Integer, Character> object =
                new GenericClass<>("str", 12, 'a');
        String result = object.method1(44, 'b');
        System.out.println(result);

        System.out.println(object.method2(5876));

        Integer integerResult = object.method3("message");
        System.out.println(integerResult);


        GenericClassImpl<String> object2 =
                new GenericClassImpl<>("drefa", 5476, "dgfhfg");

        GenericClassImplImpl object3 =
                new GenericClassImplImpl("sfe", 365, "sgh");
    }
}
