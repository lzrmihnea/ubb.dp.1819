package lab2.Bridge.model;

public class Chassis implements CarComponent {
    String type;

    public Chassis(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "type='" + type + '\'' +
                '}';
    }
}
