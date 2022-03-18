package lecture10.list;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Monday");
        list.add("Tuesday");
        list.add("Monday");
        list.add("Friday");
        list.forEach(day -> System.out.println(day));

        System.out.println();
        System.out.println(list.get(2));


    }
}
