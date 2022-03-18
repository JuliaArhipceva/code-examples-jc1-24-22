package lecture11.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class ExampleFlatMap {
    public static void main(String[] args) {
        Cat fluffy = new Cat(Arrays.asList("Fluffy",
                "Fluff", "Fuf"));
        Cat tom = new Cat(Arrays.asList("Tom", "Tommy"));

        Stream.of(fluffy, tom)
                .flatMap(cat -> cat.getNames().stream())
                .forEach(System.out::println);
    }
}
