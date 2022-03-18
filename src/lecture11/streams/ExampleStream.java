package lecture11.streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class ExampleStream {
    public static void main(String[] args) {
        Stream<String> days = Stream.of("Monday", "Tuesday");
        Optional<String> first = days.findFirst();
        System.out.println(first.get());

        Stream.of("Monday", "Tuesday").forEach(System.out::println);

        String[] array = {"Wednesday", "Thursday"};
        Arrays.stream(array).forEach(System.out::println);
    }
}
