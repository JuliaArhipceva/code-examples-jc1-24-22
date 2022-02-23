package lecture5;

import java.util.Random;

public class ExampleArray {
    public static void main(String[] args) {
//        int array[];
        int[] array = {23, 2, 2022};
        System.out.println(array.length);

        System.out.println(array[2]); // 2022

        System.out.println("----------------------");
        for (int element : array) {
            System.out.println(element);
            element = 1;
        }
        System.out.println("----------------------");
        for (int element : array) {
            System.out.println(element);
        }
        System.out.println("----------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            array[i] = 1;
        }
        System.out.println("----------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


//        System.out.println(array[-1]); // exception
//        System.out.println(array[10]); // exception

        Random random = new Random();
        int bound = 100;

        int arraySize = 10;
        int[] arrayOfRandomNumbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print(arrayOfRandomNumbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arraySize; i++) {
            arrayOfRandomNumbers[i] = random.nextInt(bound);
            System.out.print(arrayOfRandomNumbers[i] + " ");
        }

        System.out.println();
        array = new int[]{1, 2, 7};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        int[] clonedArray = array.clone();
        for (int element : clonedArray) {
            System.out.print(element + " ");
        }

        int intVar = 7;
        int newVar = intVar;

    }
}
