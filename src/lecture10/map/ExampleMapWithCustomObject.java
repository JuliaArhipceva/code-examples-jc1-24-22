package lecture10.map;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ExampleMapWithCustomObject {
    public static void main(String[] args) {
        Map<Cat, String> cats = new HashMap<>();
        Cat tom = new Cat("Tom", 7);
        Cat snowball = new Cat("Snowball", 5);
        Cat fluffy = new Cat("Fluffy", 3);

        cats.put(snowball, "* * * * *");
        cats.put(tom, "Tom!!!");
        cats.put(fluffy, "This is Fluffy!");
        printMap(cats);

        SortedMap<Cat, String> sortedCats = new TreeMap<>();
        sortedCats.put(snowball, "* * * * *");
        sortedCats.put(tom, "Tom!!!");
        sortedCats.put(fluffy, "This is Fluffy!");
        printMap(sortedCats);
    }

    private static void printMap(Map<Cat, String> map) {
        map.forEach((cat, description) ->
                System.out.println(cat.getName() + ", " + cat.getAge() + ": " + description));
    }
}
