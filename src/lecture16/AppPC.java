package lecture16;

import java.util.ArrayList;
import java.util.List;

public class AppPC {

    public static final int PRODUCER_COUNT = 7;
    public static final int CONSUMER_COUNT = 5;

    public static void main(String[] args) throws InterruptedException {

        ProducerAndConsumer pc = new ProducerAndConsumer();

        List<Thread> producers = new ArrayList<>();
        for (int i = 0; i < PRODUCER_COUNT; i++) {
            producers.add(new Thread(pc::produce));
        }

        List<Thread> consumers = new ArrayList<>();
        for (int i = 0; i < CONSUMER_COUNT; i++) {
            consumers.add(new Thread(pc::consume));
        }

        producers.forEach(Thread::start);

        consumers.forEach(Thread::start);

        for (Thread producer : producers) {
            producer.join();
        }
        for (Thread consumer : consumers) {
            consumer.join();
        }

    }
}
