package lecture11.lambdas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Calendar calendar = (numberOfDay, day) ->
                System.out.println("There are " + (7 - numberOfDay) +
                        " days from " + day + " to Sunday!");
        calendar.countDaysToSunday(5, "Friday");

        List<String> days = List.of("Monday", "Tuesday");
        days.forEach(System.out::println);

        Map<Integer, String> daysOfWeek =
                Map.of(1, "Monday", 2, "Tuesday");
        daysOfWeek.forEach((key, value) ->
                System.out.println(key + ": " + value)
        );

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Monday");
        map.put(2, "Tuesday");
    }
}
/*
        Calendar calendar = new Calendar() {
            @Override
            public void countDaysToSunday(int numberOfDay, String day) {
                System.out.println("There are " + (7 - numberOfDay) +
                        " days from " + day + " to Sunday!");
            }
        };

        Calendar calendar = (int numberOfDay, String day) -> {
            System.out.println("There are " + (7 - numberOfDay) +
                    " days from " + day + " to Sunday!");
        };

        Calendar calendar = (int numberOfDay, String day) ->
                System.out.println("There are " + (7 - numberOfDay) +
                        " days from " + day + " to Sunday!");
 */

/*
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String day) {
                System.out.println(day);
            }
        };
 */