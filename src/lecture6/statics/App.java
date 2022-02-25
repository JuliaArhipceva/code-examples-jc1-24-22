package lecture6.statics;

public class App {
    public static void main(String[] args) {
        System.out.println(Cat.numberOfPaws);
//        System.out.println(Cat.name);
        Cat.sayMeow();
//        Cat.sayName();

        Cat cat = new Cat();
        System.out.println(cat.numberOfPaws);
        System.out.println(cat.name);
        cat.sayMeow();
        cat.sayName();
    }

    public void main() {
        System.out.println(Cat.numberOfPaws);
//        System.out.println(Cat.name);

        Cat.sayMeow();
//        Cat.sayName();
    }
}
