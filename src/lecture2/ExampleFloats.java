package lecture2;

public class ExampleFloats {
    public static void main(String[] args) {
        System.out.println("FLOAT");
        float floatVar1 = 5.786575867544767f;
        System.out.println(floatVar1);
        float floatVar2 = 7.6F;
        System.out.println(floatVar2);

        System.out.println("DOUBLE");
        double doubleVar1 = 252.524243654634735675856;
        System.out.println(doubleVar1);
        double doubleVar2 = floatVar1;
        System.out.println(doubleVar2);

        float floatVar3 = (float) doubleVar1;
        System.out.println(floatVar3);
    }
}
