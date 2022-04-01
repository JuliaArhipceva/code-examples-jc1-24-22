package lecture15.raceconditions;

public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }
}
