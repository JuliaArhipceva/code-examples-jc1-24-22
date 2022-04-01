package lecture15.raceconditions;

public class App {

    private static final int THREAD_COUNT = 10000;

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = counter::increment;

        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(runnable, "thread" + i);
        }

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i].start();
        }

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i].join();
        }

        System.out.println(counter.getValue());

    }
}
