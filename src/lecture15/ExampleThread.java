package lecture15;

public class ExampleThread {
    public static void main(String[] args) throws InterruptedException {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());
        System.out.println(currentThread.getThreadGroup());
        System.out.println(currentThread.getId());
        System.out.println(currentThread.getState());
        System.out.println(currentThread.getPriority());

        System.out.println("before runnable");

        Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
//        runnable.run(); // just run, no new thread
        Thread thread = new Thread(runnable, "my thread");
        thread.start();
//        thread.join();

//        Thread.sleep(1000);

        System.out.println(thread.getState());

        System.out.println("after runnable");
//        thread.start();

        Runnable showAllThreads = () -> {
            System.out.println("Active threads");
            int activeCount = Thread.activeCount();
            Thread[] threads = new Thread[activeCount];
            Thread.enumerate(threads);
            for (Thread t : threads) {
                System.out.println(t.getName());
                System.out.println(t.isInterrupted());
                t.interrupt();
                System.out.println(t.isInterrupted());
            }
        };
        Thread threadForShowingAllThreads = new Thread(showAllThreads, "show all threads");
        threadForShowingAllThreads.start();
    }
}
