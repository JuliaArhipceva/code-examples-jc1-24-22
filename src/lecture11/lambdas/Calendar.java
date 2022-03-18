package lecture11.lambdas;

@FunctionalInterface
public interface Calendar {
    void countDaysToSunday(int numberOfDay, String day);
}
