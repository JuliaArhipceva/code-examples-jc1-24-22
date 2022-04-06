package lecture17.atomics;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public class Counter {

    private AtomicInteger value;
    private AtomicReference<String> atomicReference;
    private AtomicMarkableReference<Integer> atomicMarkableReference;

    public Counter() {
        this.value = new AtomicInteger();
        this.atomicReference = new AtomicReference<>();
    }

    public void increment() {
        value.incrementAndGet();
    }

    public int getValue() {
        return value.intValue();
    }

    public void process() {
        String strValue = atomicReference.get();
        atomicMarkableReference.isMarked();
    }
}
