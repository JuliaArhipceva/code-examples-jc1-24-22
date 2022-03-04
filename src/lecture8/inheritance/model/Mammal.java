package lecture8.inheritance.model;

public abstract class Mammal implements Movable {

    protected static final String LINE_SEPARATOR = System.lineSeparator();

    private String name;
    protected int age;

    protected Mammal(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public void walk() {
//        System.out.println("I'm walking!");
//    }

    public final void sleep() {
        System.out.println("I'm going to sleep for 8 hours");
    }

    public void sleep(int hours) {
        System.out.println("I'm going to sleep for " + hours + " hours");
    }

    protected abstract void eat();

    @Override
    public String toString() {
        return "Name: " + name + LINE_SEPARATOR +
                "Age: " + age + LINE_SEPARATOR;
    }
}
