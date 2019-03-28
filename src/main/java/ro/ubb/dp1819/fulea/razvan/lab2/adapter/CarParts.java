package ro.ubb.dp1819.fulea.razvan.lab2.adapter;

public class CarParts {
    private String wheels;
    private String chassis;
    private String engine;
    private String paint;

    public CarParts() {
    }

    public CarParts(String wheels, String chassis, String engine, String paint) {
        this.wheels = wheels;
        this.chassis = chassis;
        this.engine = engine;
        this.paint = paint;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    @Override
    public String toString() {
        return "CarParts{" +
                "wheels='" + wheels + '\'' +
                ", chassis='" + chassis + '\'' +
                ", engine='" + engine + '\'' +
                ", paint='" + paint + '\'' +
                '}';
    }
}
