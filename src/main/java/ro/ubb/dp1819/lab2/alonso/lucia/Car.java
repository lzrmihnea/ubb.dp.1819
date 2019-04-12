package ro.ubb.dp1819.lab2.alonso.lucia;

public class Car implements Driveable {

    //public enum Wheel {SUMMER, WINTER}
    //public enum Chasis {TITANIUM, ALUMINIUM, VIBRANIUM, ADAMANTIUM}
    //public enum Engine {ELECTRIC, DIESEL, GPL}
    //public enum Paint {RED, WHITE, BLACK, BLUE, PINK, GREEN, YELLOW}

    private String wheel;
    private String chasis;
    private String engine;
    private String paint;

    public Car( String wheel, String chasis, String engine, String paint ) {
        this.wheel = wheel;
        this.chasis = chasis;
        this.engine = engine;
        this.paint = paint;
    }

    @Override
    public String car() {
        return Car.class.toString();
    }

    @Override
    public String toString() {
        return "Car: " +
                "4 " + wheel + " wheels, " +
                "1 " + chasis + " chasis, " +
                "1 " + engine + " engine, " +
                "1 " + paint + " paint.";

    }
}
