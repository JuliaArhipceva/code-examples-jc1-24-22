package lecture11.streams;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ExampleOptional {
    public static void main(String[] args) {
        List<String> days = List.of("Monday", "Tuesday",
                "Friday", "Monday", "Sunday");
        Optional<String> first = days.stream().findFirst();
        System.out.println(first);

        if (first.isPresent()) {
            System.out.println(first.get());
        }

        Optional<String> random = days.stream()
                .filter(day -> day.equals("fhghzsli"))
                .findFirst();
//        System.out.println(random.get());

        first.ifPresent(value -> System.out.println("First: " + value));
        random.ifPresent(value -> System.out.println("Random: " + value));

        System.out.println(first.orElse("Default for first"));
        System.out.println(random.orElse("Default for random"));

        System.out.println(first.orElseGet(() -> UUID.randomUUID().toString()));
        System.out.println(random.orElseGet(() -> UUID.randomUUID().toString()));

        System.out.println(first.map(String::toUpperCase));
    }
}
