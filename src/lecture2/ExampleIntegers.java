package lecture2;

public class ExampleIntegers {
    public static void main(String[] args) {

        System.out.println("BYTE");
        byte byteVar1 = 77; // -128..127
        System.out.println(byteVar1);
        byte byteVar2 = -128;
        System.out.println(byteVar2);
        int intVarForByteVar3 = 127;
        byte byteVar3 = (byte) intVarForByteVar3;
        System.out.println(byteVar3);
        byte byteVar4 = (byte) 130;
        System.out.println(byteVar4); // -126

        System.out.println("SHORT");
        short shortVar1 = 8546;
        System.out.println(shortVar1);

        System.out.println("INT");
        int intVar1 = 586734586;
        System.out.println(intVar1);
        int intVar2 = shortVar1;
        System.out.println(intVar2);
        int intVar3 = (int) shortVar1;
        System.out.println(intVar3);

        System.out.println("LONG");
        long longVar1 = 674647;
        System.out.println(longVar1);
//        long longVar2 = 865348576934l;
        long longVar2 = 865348576934L;
        System.out.println(longVar2);

        System.out.println("10 16 8 2");

        int intVarIn10 = 77;
        System.out.println(intVarIn10);
        int intVarIn16_1 = 0x7c; // 124
        System.out.println(intVarIn16_1);
        int intVarIn16_2 = 0X77; // 119
        System.out.println(intVarIn16_2);
        int intVarIn8 = 077; // 63
        System.out.println(intVarIn8);
        int intVarIn2 = 0b101; // 5
        System.out.println(intVarIn2);
    }
}
