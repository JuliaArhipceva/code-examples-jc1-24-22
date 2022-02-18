package lecture3;

public class ExampleIncrementDecrement {
    public static void main(String[] args) {
        int a = 17;

        System.out.println(a); // 17
        System.out.println(a++); // 17
        System.out.println(a); // 18
        System.out.println("---------------------------");
        System.out.println(a); // 18
        System.out.println(a--); // 18
        System.out.println(a); // 17
        System.out.println("---------------------------");


        System.out.println(a); // 17
        System.out.println(++a); // 18
        System.out.println(a); // 18
        System.out.println("---------------------------");
        System.out.println(a); // 18
        System.out.println(--a); // 17
        System.out.println(a); // 17
        System.out.println("---------------------------");


        // a = 17
        System.out.println(a++ + 7); // 24
        System.out.println(a); // 18

        // a = 18
        System.out.println(9 + --a); // 26
        System.out.println(a); // 17

        a++;
        System.out.println(a); // 18

        ++a;
        System.out.println(a); // 19

    }
}
