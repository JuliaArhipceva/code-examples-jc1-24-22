package lecture8.inheritance.model;

public final class Cat extends Mammal {

    private static final String CAT = "cat";
    private String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void walk() {

    }

    @Override
    public void eat() {
        System.out.println("I'm " + CAT + " and I'm eating");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Breed: " + breed + LINE_SEPARATOR;
    }
}
