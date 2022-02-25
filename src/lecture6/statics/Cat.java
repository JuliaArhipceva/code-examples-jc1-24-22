package lecture6.statics;

public class Cat {

    public static int numberOfPaws = 4;
    public String name;

    public static void sayMeow() {
        System.out.println("Meow");
        System.out.println(numberOfPaws);
//        System.out.println(name);
    }

//    static {
//        System.out.println(name);
//    }
//
//    {
//        System.out.println(name);
//    }

    public void sayName() {
        System.out.println("Name: " + name);
        System.out.println(numberOfPaws);
        System.out.println(name);
    }

}
