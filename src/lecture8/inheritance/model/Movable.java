package lecture8.inheritance.model;

public interface Movable {
    void walk();

    default void speak() {
        System.out.println("jsguhlier");
    }

    static void breeze() {
        System.out.println("_--__-__-___-");
    }
}
