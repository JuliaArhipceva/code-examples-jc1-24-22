package lecture4;

import java.util.Random;

public class ExampleDoWhile {

    public static void main(String[] args) {
        Random random = new Random();
        int bound = 10;

        int exit = 0;

        int randomNumber = random.nextInt(bound);
        while (randomNumber != exit) {
            System.out.println("start while");
            System.out.println(randomNumber);
            randomNumber = random.nextInt(bound);
            System.out.println("end while");
        }

        do {
            System.out.println("start do..while");
            randomNumber = random.nextInt(bound);
            System.out.println(randomNumber);
            System.out.println("end do..while");
        } while (randomNumber != exit);

        System.out.println();

        boolean booleanVarFalse = false;
        while (booleanVarFalse) {
            System.out.println("inside while");
        }

        do {
            System.out.println("inside do..while");
        } while (booleanVarFalse);

    }

}
