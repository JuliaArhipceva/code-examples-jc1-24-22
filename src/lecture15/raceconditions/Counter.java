package lecture15.raceconditions;

public class Counter {
    private final Object lock = new Object();

    // Sonar violation:
    // Synchronization should not be based on Strings or boxed primitives
    private final Integer lock1 = 0;

    //    private volatile int value;
    private int value;

    public Counter() {
        this.value = 0;
    }

    //    public synchronized void increment() {
    public void increment() {
//        synchronized (this) {
//            value++;
//        }
//        synchronized (lock) {
//            value++;
//        }
        synchronized (lock1) {
            value++;
        }
//        value++;
    }

    public int getValue() {
        return value;
    }
}
