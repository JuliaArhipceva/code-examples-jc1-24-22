package lecture11.streams;

import java.util.List;
import java.util.stream.Stream;

public class ExampleStreamOnCollection {
    public static void main(String[] args) {
        List<String> days = List.of("Monday", "Tuesday",
                "Friday", "Monday", "Sunday");
        System.out.println("Input: " + String.join(", ", days));

        System.out.println("distinct");
        days.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("Input: " + String.join(", ", days));

        System.out.println("filter");
        Stream<String> stream = days.stream();
        stream.filter(day -> day.endsWith("day") && !day.startsWith("M"))
                .forEach(day -> System.out.print(day + ", "));
//        stream.distinct().findFirst(); // not allowed

        System.out.println("\n\rlimit");
        days.stream()
                .limit(3)
                .forEach(day -> System.out.print(day + ", "));
        System.out.println("\n\rInput: " + String.join(", ", days));

        System.out.println("map");
        days.stream()
                .map(String::length)
                .forEach(length -> System.out.print(length + ", "));

        System.out.println("skip");
        days.stream()
                .skip(3)
                .forEach(day -> System.out.print(day + ", "));

        System.out.println("\r\nsort");
        days.stream()
                .sorted()
                .forEach(day -> System.out.print(day + ", "));

        System.out.println("\r\nsort with comparator");
        days.stream()
                .sorted((day1, day2) -> day2.length() - day1.length())
//                .sorted((day1, day2) -> day1.length() - day2.length())
//                .sorted(Comparator.comparingInt(String::length))
                .forEach(day -> System.out.print(day + ", "));

        System.out.println();
        days.stream()
                .distinct() // 4
                .filter(day -> day.length() == 6) // 3
                .sorted() // 3
                .limit(2) // 2
                .map(String::toUpperCase) // 2
                .forEach(day -> System.out.print(day + " ")); // FRIDAY MONDAY
    }
}
