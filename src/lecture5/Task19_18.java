package lecture5;

import java.util.Arrays;
import java.util.Random;

/**
 * 19.18. Заполнить массив положительными
 * случайными двузначными числами так,
 * чтобы они образовывали неубывающую
 * последовательность (каждый элемент
 * не меньше предыдущего).
 */
public class Task19_18 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        array[0] = 10;

        int count = 0;

        for (int i = 1; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
            if (array[i] < array[i - 1]) {
                i--;
            }
            count++;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(count);
    }
}
