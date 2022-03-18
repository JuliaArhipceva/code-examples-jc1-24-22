package lecture11.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStreamTerminal {
    public static void main(String[] args) {
        List<String> days = List.of("Monday", "Tuesday",
                "Friday", "Monday", "Sunday");

        System.out.println("allMatch");
        boolean allMatchLength = days.stream()
                .allMatch(day -> day.length() == 6);
        System.out.println("allMatchLength = " + allMatchLength); // false
        boolean allMatchEndsWith = days.stream()
                .allMatch(day -> day.endsWith("day"));
        System.out.println("allMatchEndsWith = " + allMatchEndsWith); // true

        System.out.println("anyMatch");
        boolean anyMatchLength = days.stream()
                .anyMatch(day -> day.length() == 6); // true
        System.out.println("anyMatchLength = " + anyMatchLength);
        boolean anyMatchEndsWith = days.stream()
                .anyMatch(day -> day.endsWith("day")); // true
        System.out.println("anyMatchEndsWith = " + anyMatchEndsWith);

        System.out.println("noneMatch");
        boolean noneMatchLength = days.stream()
                .noneMatch(day -> day.length() == 6);
        System.out.println("noneMatchLength = " + noneMatchLength); // false
        boolean noneMatchEndsWith = days.stream()
                .noneMatch(day -> day.endsWith("day"));
        System.out.println("noneMatchEndsWith = " + noneMatchEndsWith); // false

        System.out.println("collect");
        List<String> collectedDistinctDays = days.stream()
                .distinct().collect(Collectors.toList());
        collectedDistinctDays.forEach(System.out::println);

        System.out.println("findFirst");
        System.out.println(days.stream().findFirst().get());
        System.out.println("findAny");
        System.out.println(days.stream().findAny().get());

        System.out.println("max");
        System.out.println(days.stream().max(Comparator.naturalOrder()).get());
        System.out.println("min");
        System.out.println(days.stream().min(Comparator.naturalOrder()).get());

        Object[] array = days.stream().distinct().toArray();
        System.out.println(Arrays.toString(array));
    }
}
