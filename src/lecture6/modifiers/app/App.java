package lecture6.modifiers.app;

import lecture6.modifiers.models.Cat;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
//        System.out.println(cat.breed);
//        System.out.println(cat.age);
//        System.out.println(cat.gender);

        cat.walk();
//        cat.talk();
//        cat.eat();
//        cat.sleep();

        cat.callSleepMethod();

        System.out.println(cat.getGender());
        cat.setGender("Male");
        System.out.println(cat.getGender());
    }
}
