package lecture10.map;

public class Cat implements Comparable<Cat> {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Cat cat) {
        return cat.age - this.age;
//        return this.name.compareTo(cat.name);
    }
}
