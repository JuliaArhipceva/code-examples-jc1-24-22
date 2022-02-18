package lecture4;

import java.util.Scanner;

public class ExampleWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int exit = -1;
//        int numberFromUser = 0;
        int numberFromUser = -1; // workaround

        System.out.println("before 1 while");

//        loop: // Labels are very BAD practice
        while (numberFromUser != exit) {
            System.out.println("inside 1 while");

            System.out.print("enter number: ");
            numberFromUser = scanner.nextInt();
        }
        System.out.println("after 1 while");

        System.out.println("before 2 while");
        while (numberFromUser != exit && 2 > 5) {
            System.out.println("inside 2 while");
        }
        System.out.println("after 2 while");

        boolean booleanVar = true;

//        while (booleanVar) {
//            System.out.println("hello");
//        }

//        while (true) {
//            System.out.println("hello");
//        }

        while (booleanVar) {
            System.out.println("hello");
            if (7 > 3) {
                break;
            }
        }

        while (booleanVar) {
            System.out.println("hello");
            booleanVar = false;
        }

        int count = 5;
        while (count++ <= 10) {
            System.out.print(count + " ");
        }
        System.out.println();
        count = 5;
        while (++count <= 10) {
            System.out.print(count + " ");
        }

        System.out.println();

        count = 0;
        while (count <= 10) {
            System.out.println();
            System.out.print("start ");
            count++;
            if (count == 7) {
                continue;
            }
            System.out.print(count);
            System.out.print(" end");
        }

    }
}

/*
            if (true) {
                continue loop;
            }

            while() {
                while() {
                    break loop;
                }
            }
 */
