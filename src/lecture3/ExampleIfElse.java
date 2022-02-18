package lecture3;

import java.util.Scanner;

public class ExampleIfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int number = scanner.nextInt();

        if (number > 10) {
            System.out.println("Number is greater than 10");
        }

        System.out.println("-------------------");

        if (number > 0 && number < 7) {
            System.out.println("Number is between 0 and 7");
        } else {
            System.out.println("Number is not between 0 and 7");
        }

        System.out.println("-------------------");

        if (number > 0 && number < 7) {
            System.out.println("Number is between 0 and 7");
        } else if (number > 7 && number < 10) {
            System.out.println("Number is between 7 and 10");
        } else if (number == 12) {
            System.out.println("Number is 9");
        } else {
            System.out.println("Number is not between 0 and 7");
        }
    }

}
