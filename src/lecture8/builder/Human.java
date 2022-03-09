package lecture8.builder;

public class Human {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static Builder builder(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder(String name) {
            this.name = name;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Human build() {
            Human human = new Human();
            human.name = this.name;
            human.age = this.age;
            return human;
        }
    }
}
