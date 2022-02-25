package lecture6.modifiers.models;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
        System.out.println(cat.breed);
        System.out.println(cat.age);
//        System.out.println(cat.gender);

        cat.walk();
        cat.talk();
        cat.eat();
//        cat.sleep();
    }
}
