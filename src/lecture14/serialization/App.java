package lecture14.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {

    private static final String FILE = "cat.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat("Fluffy", 3, "Maine Coon");
        System.out.println(cat);

        try (FileOutputStream fos = new FileOutputStream(FILE);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(cat);
        }

        try (FileInputStream fis = new FileInputStream(FILE);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object object = ois.readObject();
            System.out.println(object);
        }
    }
}
