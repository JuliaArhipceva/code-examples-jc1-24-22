package lecture10.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Tuesday");
        map.put(1, "Monday");
//        String value = map.put(1, "Monday");

        System.out.println("map.get(2) = " + map.get(2));
        System.out.println("map.get(3) = " + map.get(3));
        System.out.println("map.getOrDefault(2, \"default value\") = " +
                map.getOrDefault(2, "default value"));
        System.out.println("map.getOrDefault(3, \"default value\") = " +
                map.getOrDefault(3, "default value"));

        System.out.println("map.containsKey(2) = " + map.containsKey(2));
        System.out.println("map.containsKey(3) = " + map.containsKey(3));
        System.out.println("map.containsValue(\"Monday\") = " +
                map.containsValue("Monday"));
        System.out.println("map.containsValue(\"rgsred\") = " +
                map.containsValue("rgsred"));

        map.forEach((key, value) -> System.out.println(key + ": " + value));

        map.putIfAbsent(1, "new value");
        map.putIfAbsent(5, "Friday");
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("map.size() = " + map.size());
        map.keySet().forEach(key -> System.out.println(key));
        map.values().forEach(value -> System.out.println(value));

        System.out.println("map.replace");
        map.replace(1, "slrhfgliseh", "new value");
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        map.replace(1, "new value");
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        map.remove(1);
        System.out.println("map.remove(1)");
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        map.remove(2, "sdrbhet");
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        map.remove(2, "Tuesday");
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        map.clear();
        System.out.println("map.clear();");
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
