package lecture3;

public class ExampleBitwiseOperators {
    public static void main(String[] args) {
        int a = 17;
        int b = 21;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(-b));

        System.out.println("-------------------------");
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(~a);
        System.out.println(Integer.toBinaryString(~b));
        System.out.println(~b);
        System.out.println("-------------------------");
        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(a & b);
        System.out.println("-------------------------");
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(a | b);
        System.out.println("-------------------------");
        System.out.println(Integer.toBinaryString(a ^ b));
        System.out.println(a ^ b);

        System.out.println("-------------------------");
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a >> 1);
        System.out.println(Integer.toBinaryString(a >> 1));
        System.out.println(a >> 2);
        System.out.println(a >> 3);
        System.out.println(a >> 4);
        System.out.println(Integer.toBinaryString(a >> 4));
        System.out.println(a >> 5);
        System.out.println(Integer.toBinaryString(a >> 5));
        System.out.println(a >> 34);
        System.out.println(Integer.toBinaryString(a >> 34));

        System.out.println("-------------------------");
        System.out.println(-a);
        System.out.println(Integer.toBinaryString(-a));
        System.out.println(-a >> 1);
        System.out.println(Integer.toBinaryString(-a >> 1));
        System.out.println(-a >> 2);
        System.out.println(-a >> 3);
        System.out.println(-a >> 4);
        System.out.println(Integer.toBinaryString(-a >> 4));
        System.out.println(-a >> 5);
        System.out.println(Integer.toBinaryString(-a >> 5));
        System.out.println(-a >> 34);
        System.out.println(Integer.toBinaryString(-a >> 34));

        System.out.println("-------------------------");
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a >>> 1);
        System.out.println(Integer.toBinaryString(a >>> 1));
        System.out.println(a >>> 2);
        System.out.println(a >>> 3);
        System.out.println(a >>> 4);
        System.out.println(Integer.toBinaryString(a >>> 4));
        System.out.println(a >>> 5);
        System.out.println(Integer.toBinaryString(a >>> 5));
        System.out.println(a >>> 34);
        System.out.println(Integer.toBinaryString(a >>> 34));

        System.out.println("-------------------------");
        System.out.println(-a);
        System.out.println(Integer.toBinaryString(-a));
        System.out.println(-a >>> 1);
        System.out.println(Integer.toBinaryString(-a >>> 1));
        System.out.println(-a >>> 2);
        System.out.println(-a >>> 3);
        System.out.println(-a >>> 4);
        System.out.println(Integer.toBinaryString(-a >>> 4));
        System.out.println(-a >>> 5);
        System.out.println(Integer.toBinaryString(-a >>> 5));
        System.out.println(-a >>> 34);
        System.out.println(Integer.toBinaryString(-a >>> 34));

        System.out.println("-------------------------");
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a << 1);
        System.out.println(Integer.toBinaryString(a << 1));
        System.out.println(a << 2);
        System.out.println(a << 3);
        System.out.println(a << 4);
        System.out.println(Integer.toBinaryString(a << 4));
        System.out.println(a << 5);
        System.out.println(Integer.toBinaryString(a << 5));
        System.out.println(a << 34);
        System.out.println(Integer.toBinaryString(a << 34));

        System.out.println("-------------------------");
        System.out.println(-a);
        System.out.println(Integer.toBinaryString(-a));
        System.out.println(-a << 1);
        System.out.println(Integer.toBinaryString(-a << 1));
        System.out.println(-a << 2);
        System.out.println(-a << 3);
        System.out.println(-a << 4);
        System.out.println(Integer.toBinaryString(-a << 4));
        System.out.println(-a << 5);
        System.out.println(Integer.toBinaryString(-a << 5));
        System.out.println(-a << 34);
        System.out.println(Integer.toBinaryString(-a << 34));

    }
}
