package lecture17.locks;

import lecture15.raceconditions.Counter;

public class App {

    private static final int THREAD_COUNT = 10000;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            int result = run();
            if (result < THREAD_COUNT) {
                System.out.println(result);
            }
        }
    }

    private static int run() throws InterruptedException {
        lecture15.raceconditions.Counter counter = new Counter();
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

        return counter.getValue();
    }
}
