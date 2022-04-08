package lecture17.parking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    public static final int CAR_COUNT = 10;

    public static final Parking PARKING = new Parking();

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(CAR_COUNT);

        for (int i = 0; i < CAR_COUNT; i++) {
//            executor.submit(new Car("#" + i));
            executor.execute(new Car("#" + i));
        }

        executor.shutdown();

//        executor.submit(new Car("f")); // will fail
    }

}
