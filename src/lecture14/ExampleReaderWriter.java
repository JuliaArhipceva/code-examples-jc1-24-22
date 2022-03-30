package lecture14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ExampleReaderWriter {

    private static final String FILE = "fileRW.txt";
    private static final String TEXT = "text";

    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter(FILE)) {
            fileWriter.write(TEXT, 1, 3);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        try (FileReader fileReader = new FileReader(FILE)) {
            char[] buffer = new char[3];
            int count = fileReader.read(buffer);
            System.out.println(Arrays.toString(buffer));
            System.out.println(count);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

}
