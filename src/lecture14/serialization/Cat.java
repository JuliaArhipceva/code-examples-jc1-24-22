package lecture14.serialization;

import java.io.Serializable;

public class Cat implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private transient int age;
    private String breed;

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
