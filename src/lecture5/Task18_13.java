package lecture5;

import java.util.Random;
import java.util.Scanner;

/**
 * 18.13. Напишите класс, который заполняет
 * случайными четырехзначными числами массив,
 * размер которого при инициализации вводится
 * с клавиатуры. После заполнения класс должен
 * вывести на экран значения массива в одной
 * строке, начиная с «конца» массива
 * (с последней ячейки).
 */
public class Task18_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];

        int min = 1000;
        int max = 9999;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
