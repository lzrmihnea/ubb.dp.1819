package lab2.Bridge.model;

import lab2.Proxy.CarPriceable;

import java.util.List;

public class Car implements CarPriceable {
    private List<Wheel> wheels;
    private Chassis chassis;
    private Engine engine;
    private Paint paint;
    private Long price = Math.round(Math.random());

    public Car(List<Wheel> wheels, Chassis chassis, Engine engine, Paint paint) {
        this.wheels = wheels;
        this.chassis = chassis;
        this.engine = engine;
        this.paint = paint;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", chassis=" + chassis +
                ", engine=" + engine +
                ", paint=" + paint +
                '}';
    }

    @Override
    public Long getPrice() {
        return price;
    }
}
