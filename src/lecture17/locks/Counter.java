package lecture17.locks;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    private ReentrantLock lock = new ReentrantLock();
    private int value;

    public Counter() {
        this.value = 0;
    }

    public void increment() {
        lock.lock();
        try {
            value++;
        } finally {
            lock.unlock();
        }
    }

    public int getValue() {
        return value;
    }
}
