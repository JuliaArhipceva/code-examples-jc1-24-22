package lecture5;

import java.util.Scanner;

/**
 * 20 023 565
 * <p>
 * 2 147 483 647
 */
public class Task17 {
    public static void main(String[] args) {
        System.out.print("enter your number: ");
        Scanner scanner = new Scanner(System.in);
        long number = 2_234_456L;
        if (scanner.hasNextLong()) {
            number = scanner.nextLong();
        }
        System.out.println();
        long divider = 1_000_000_000_000_000_000L;
        boolean isNumberStarted = false;
        boolean isFirstDigit = true;
        while (divider >= 1) {
            long divided = number / divider;
            if (divided > 0) {
                isNumberStarted = true;
                if (!isFirstDigit) {
                    if (divided > 100) {
                        System.out.print(divided + " ");
                    } else if (divided > 10) {
                        System.out.print("0" + divided + " ");
                    } else {
                        System.out.print("00" + divided + " ");
                    }
                } else {
                    System.out.print(divided + " ");
                }
            } else if (isNumberStarted) {
                System.out.print("000 ");
            }

            number %= divider;
            divider /= 1000;
        }
    }
}
