package lecture20;

public class Cat extends Mammal {

    @Annotation(isPrefixNeeded = true, prefix = "Name")
    private String name;

    @Annotation(isPrefixNeeded = true, prefix = "Age")
    public int age;

    public Cat() {
    }

    public Cat(String title, String name, int age) {
        super(title);
        this.name = name;
        this.age = age;
    }


    private void printName(String prefix) {
        System.out.println(prefix + ": " + name);
    }
}
