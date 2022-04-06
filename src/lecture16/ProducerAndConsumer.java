package lecture16;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProducerAndConsumer {

    private static final int MAX_PRODUCT_COUNT = 3;

    private final List<String> products = new ArrayList<>();

    public void produce() {
        try {
            synchronized (this) {
                while (products.size() == MAX_PRODUCT_COUNT) {
                    System.out.println("Product cannot be produced "
                            + " by thread " + Thread.currentThread().getName());
                    // not very good solution
                    wait();
                }
                String product = UUID.randomUUID().toString();
                products.add(product);
                System.out.println("Produced: " + product
                        + " by thread " + Thread.currentThread().getName());

                notifyAll();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void consume() {
        try {
            synchronized (this) {
                while (products.isEmpty()) {
                    System.out.println("Product cannot be consumed "
                            + " by thread " + Thread.currentThread().getName());
                    wait();
                }
                System.out.println("Consumed: " + products.remove(0)
                        + " by thread " + Thread.currentThread().getName());
                notifyAll();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getSize() {
        return products.size();
    }
}
