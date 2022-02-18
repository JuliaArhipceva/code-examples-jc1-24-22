package lecture3;

public class ExampleSwitch {
    public static void main(String[] args) {
//        int a = 7;
//        int a = 1;
        int a = 15;
        switch (    a)
        {
            case     1:
                System.out.println(1); System.out.println("Hello!");
                break;
            case 7:
//                System.out.println("number > 0");
                System.out.println(7);
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("number > 0");
                break;
            default:
                System.out.println("number is unknown");
        }
    }
}
