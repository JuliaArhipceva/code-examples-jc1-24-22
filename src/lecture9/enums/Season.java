package lecture9.enums;

public enum Season {
    WINTER("December", -5),
    SPRING("March", 0),
    SUMMER("June", 20),
    FALL("September", 10);

    private String startingMonth;
    private float averageTemperature;

//    Season() {
//    }
//
//    Season(String startingMonth) {
//        this.startingMonth = startingMonth;
//    }

    Season(String startingMonth, float averageTemperature) {
        this.startingMonth = startingMonth;
        this.averageTemperature = averageTemperature;
    }

    public String getStartingMonth() {
        return startingMonth;
    }

    public float getAverageTemperature() {
        return averageTemperature;
    }

    @Override
    public String toString() {
        return super.toString() +
                "{startingMonth='" + startingMonth + '\'' +
                ", averageTemperature=" + averageTemperature +
                "} ";
    }
}
