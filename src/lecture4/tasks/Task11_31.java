package lecture4.tasks;

/**
 * 11.31. Напишите класс, который выводит на экран
 * положительные двузначные числа, заканчивающиеся
 * на цифру 7 (начиная с наименьшего).
 */
public class Task11_31 {
    public static void main(String[] args) {
        int numberOfIterations = 0;

        for (int i = 10; i < 100; i++) {
            if (i % 10 == 7) {
                System.out.print(i + " ");
            }
            numberOfIterations++;
        }
        System.out.println();
        System.out.println("number: " + numberOfIterations);

        numberOfIterations = 0;
        for (int i = 17; i < 100; i += 10) {
            System.out.print(i + " ");
            numberOfIterations++;
        }
        System.out.println();
        System.out.println("number: " + numberOfIterations);


        for (int i = 10; i < 100; ) {
            if (i % 10 == 7) {
                System.out.print(i + " ");
                i += 10;
                continue;
            }
            i++;
            numberOfIterations++;
        }
        System.out.println();
        System.out.println("number: " + numberOfIterations);

    }
}
