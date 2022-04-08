package lecture17.parking;

import java.util.Random;

import static lecture17.parking.App.PARKING;

public class Car extends Thread {

    private static final String CAR_IS_PARKED = "Car %s is parked for %d milliseconds. \r\n";

    private static final Random RANDOM = new Random();

    private final int maxWaitTime;
    private final int stayTime;

    public Car(String name) {
        super(name);
        this.maxWaitTime = RANDOM.nextInt(1000);
        this.stayTime = RANDOM.nextInt(1000);
    }

    public int getMaxWaitTime() {
        return maxWaitTime;
    }

    public int getStayTime() {
        return stayTime;
    }

    @Override
    public void run() {
        PARKING.tryPark(this);
    }

    public void park() {
        try {
            System.out.printf(CAR_IS_PARKED, getName(), stayTime);
            sleep(stayTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxWaitTime=" + maxWaitTime +
                ", stayTime=" + stayTime +
                '}';
    }
}