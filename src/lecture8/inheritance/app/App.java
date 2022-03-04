package lecture8.inheritance.app;

import lecture8.inheritance.model.Cat;
import lecture8.inheritance.model.Mammal;
import lecture8.inheritance.model.Movable;

public class App {
    public static void main(String[] args) {
//        Mammal mammal = new Mammal(); // not allowed
        final int hours = 16;

        final Cat cat = new Cat("Fluffy", 7, "Maine Coon");
//        cat.walk(); // protected
        cat.sleep(hours);
        cat.eat();
        System.out.println(cat.toString());

        cat.setAge(8);
        System.out.println(cat.toString());

//        cat = new Cat("", 3, ""); // not allowed to assign new value
//        hours = 7; // not allowed to assign new value

        Movable movable = new Cat("", 3, "");
        movable.walk();

        Mammal mammal = new Cat("", 3, "");
        mammal.sleep();

    }
}
