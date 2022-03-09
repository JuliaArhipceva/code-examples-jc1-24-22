package lecture8.builder;

public class App {
    public static void main(String[] args) {
        Human human = Human.builder("John")
                .age(44)
                .build();
        System.out.println(human);
    }
}
