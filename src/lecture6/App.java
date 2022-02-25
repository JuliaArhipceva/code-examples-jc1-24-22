package lecture6;

public class App {
    public static void main(String[] args) {
        Human tom = new Human();
        printInfo(tom);
        tom.name = "Tom";
        tom.age = 77;
        printInfo(tom);

        Human jerry = new Human("Jerry", 77);
        printInfo(jerry);

        Human human = new Human("Adam");
        printInfo(human);
        human.walk();
        human.talk("hello!");
        float returnedLoan = human.returnLoan(100);
        System.out.println("Returned loan: " + returnedLoan);
        System.out.println("Returned loan: " + human.returnLoan(700));
    }

    private static void printInfo(Human human) {
        System.out.println("Name: " + human.name);
        System.out.println("Age: " + human.age);
    }
}
