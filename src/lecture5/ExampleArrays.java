package lecture5;

import java.util.Arrays;

public class ExampleArrays {
    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.println(Arrays.toString(array));
        Arrays.fill(array, 3, 7, 3);
        System.out.println(Arrays.toString(array));

        Arrays.fill(array, 7);
        System.out.println(Arrays.toString(array));

        int[] copy = Arrays.copyOf(array, array.length);

        if (array == copy) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }

        if (Arrays.equals(array, copy)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }

        int[] unsorted = {2, 4, 1, 5, 3};
        System.out.println("Index of '4': " +
                Arrays.binarySearch(unsorted, 4)); // 1

        Arrays.sort(unsorted); // 1, 2, 3, 4, 5
        System.out.println("Index of '4': " +
                Arrays.binarySearch(unsorted, 4)); // 3
    }
}
