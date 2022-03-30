package lecture14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ExampleIOStreams {

    private static final String FILE = "file.txt";
    private static final String TEXT = "text";
    private static final byte[] TEXT_BYTES = TEXT.getBytes();

    public static void main(String[] args) {

        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE, false)) {
            fileOutputStream.write(TEXT_BYTES);
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        try (FileInputStream fileInputStream = new FileInputStream(FILE)) {
            byte[] bytes = fileInputStream.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            System.out.println(new String(bytes));

            System.out.println(fileInputStream.read());

            fileInputStream.close();
            fileInputStream.readAllBytes();
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        try (FileInputStream fileInputStream = new FileInputStream(FILE)) {
            byte[] buffer = new byte[3];
            while (fileInputStream.read(buffer) != -1) {
                System.out.println(Arrays.toString(buffer));
                Arrays.fill(buffer, (byte) 0);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
