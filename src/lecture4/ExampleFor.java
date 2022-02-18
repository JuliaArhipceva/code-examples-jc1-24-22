package lecture4;

public class ExampleFor {

    public static void main(String[] args) {
        for (int count = 0; count < 10; count++) {
            System.out.print(count + " ");
        }

        System.out.println();

        int count = 0;
        while (count < 10) {
            System.out.print(count + " ");
            count++;
        }

        System.out.println();

        int i = 0;
        for (; i < 10; ) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        i = 0;
        for (; ; ) {
            System.out.print(i + " ");
            i++;
            if (i == 10) {
                break;
            }
        }
    }

}
