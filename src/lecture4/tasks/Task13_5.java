package lecture4.tasks;

import java.util.Scanner;

/**
 * 13.5. Назовем «базой» положительного числа Х
 * сумму всех положительных целых чисел, меньших Х.
 * Напишите класс, который принимает с клавиатуры
 * положительное целое число Х и подсчитывает
 * его «базу».
 */
public class Task13_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int base = 0;
        for (int i = x; i > 0; i--) {
            base += i;
        }
        System.out.println(base);
    }
}
