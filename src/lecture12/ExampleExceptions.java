package lecture12;

import java.util.Scanner;

public class ExampleExceptions {
    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        readHeightFromUser();

//        try {
//            readAgeFromUser();
//        } catch (Exception exception) {
////            exception.printStackTrace();
//            System.out.println(exception.getMessage());
//        }

    }

    private static void readAgeFromUser() throws Exception {
        String line = SCANNER.nextLine();
        int age = Integer.parseInt(line);
        if (age < 0) {
            throw new Exception("Age can't be less than 0");
        }
        System.out.println("Age: " + age);
    }

    private static void readHeightFromUser() {
        String line = SCANNER.nextLine();
        int height = Integer.parseInt(line);
        if (height < 0) {
            throw new RuntimeException("Height can't be less than 0");
        }
        System.out.println("Height: " + height);
    }
}
