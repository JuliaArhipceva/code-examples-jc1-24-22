package lecture14.externalizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
    private static final String FILE = "dog.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog dog = new Dog("Sharik");
        System.out.println(dog);

        try (FileOutputStream fos = new FileOutputStream(FILE);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(dog);
        }

        try (FileInputStream fis = new FileInputStream(FILE);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object object = ois.readObject();
            System.out.println(object);
        }
    }
}
