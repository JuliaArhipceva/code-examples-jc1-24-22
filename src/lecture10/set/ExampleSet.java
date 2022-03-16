package lecture10.set;

import java.util.HashSet;
import java.util.Set;

public class ExampleSet {
    public static void main(String[] args) {
        Set<String> daysOfWeek = new HashSet<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Friday");
        daysOfWeek.forEach(day -> System.out.println(day));

//        Object[] objects = daysOfWeek.toArray();
        Object[] days = daysOfWeek.toArray();
        for (Object day : days) {
            System.out.println(day);
        }
    }
}
