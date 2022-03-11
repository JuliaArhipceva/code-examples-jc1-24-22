package lecture9.enums;

public class App {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        System.out.println(season.getStartingMonth());
        System.out.println(season.getAverageTemperature());
        System.out.println("---------------------------");
        season = Season.SPRING;
        System.out.println(season);
        System.out.println(season.getStartingMonth());
        System.out.println(season.getAverageTemperature());
        System.out.println("---------------------------");

        for (Season value : Season.values()) {
            System.out.println(value);
            System.out.println(value.name());
            System.out.println(value.ordinal());
            System.out.println("---------------------------");
        }

        Season seasonFromString = Season.valueOf("FALL");
        System.out.println(seasonFromString);

        seasonFromString = Season.valueOf("ghdxtjdty");
        System.out.println(seasonFromString);
    }
}
