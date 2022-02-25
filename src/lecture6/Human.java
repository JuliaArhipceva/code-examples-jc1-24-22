package lecture6;

/**
 * Description of class.
 */
public class Human {

    /**
     * Description of field.
     */
    String name;

    /**
     * Description of field.
     */
    int age;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println("I'm walking...");
    }

    public void talk(String text) {
        System.out.println("I'm talking: " + text);
    }

    public float returnLoan(int loan) {
        return loan * 1.1f;
//        System.out.println(); // Unreachable statement
    }
}
