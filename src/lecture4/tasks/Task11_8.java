package lecture4.tasks;

import java.util.Random;

/**
 * 11.8. Напишите класс, который выводит на экран
 * (в одну строку) 15 случайных чисел
 * из диапазона -20..+35.
 * После каждого отрицательного числа следует вывести
 * (вплотную к числу) символ «?» (знак вопроса).
 */
public class Task11_8 {
    public static void main(String[] args) {

        Random random = new Random();
        int minBound = -20;
        int maxBound = 35;

        // 1. create loop for 15 iterations
        int count = 15;
        for (int i = 0; i < count; i++) {
            // 2. generate random number -20..+35
            int number = random.nextInt(maxBound - minBound + 1) + minBound;
            // 3. print number
            System.out.print(number);
            // 4. check if "?" needed
//            if (number < 0) {
//                System.out.print("?");
//            }
            System.out.print(number < 0 ? "?" : "");
            System.out.print(" ");

        }

        System.out.println();
        System.out.println("----------------------");

        for (int i = 0; i < count; i++) {
            int number = random.nextInt(maxBound - minBound + 1) + minBound;
            System.out.print(number < 0 ? number + "? " : number + " ");
        }
    }
}
