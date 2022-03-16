package lecture10.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {
        Queue<Integer> integers = new ArrayDeque<>();
        integers.add(1);
        integers.add(7);
        integers.add(3);

        System.out.println("element() = " + integers.element());

        for (int i = 0; i < 4; i++) {
//            System.out.println(integers.remove());
            System.out.println(integers.poll());
        }

//        System.out.println("element() = " + integers.element());
        System.out.println("peek() = " + integers.peek());

        Deque<String> days = new ArrayDeque<>();
        days.addLast("Monday");
        days.addFirst("Tuesday");
        days.forEach(element -> System.out.println(element));
        System.out.println(days.pollFirst());

    }
}
