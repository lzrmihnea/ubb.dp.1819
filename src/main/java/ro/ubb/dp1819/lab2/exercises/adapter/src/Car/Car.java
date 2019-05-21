package Car;

public class Car {
    private Wheels wheels;
    private Chassis chassis;
    private Engine engine;
    private Paint paint;

    public Car(Wheels wheels, Chassis chassis, Engine engine, Paint paint) {
        this.wheels = wheels;
        this.chassis = chassis;
        this.engine = engine;
        this.paint = paint;
    }

    @Override
    public String toString() {
        return "4 "+wheels+" wheels, 1 "+chassis+" chassis, 1 "+engine+" engine, color: "+paint;
    }
}
