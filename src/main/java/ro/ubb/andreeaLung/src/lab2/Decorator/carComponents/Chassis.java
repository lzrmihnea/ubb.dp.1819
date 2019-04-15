package lab2.Decorator.carComponents;

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

    @Override
    public Long getPrice() {
        return 60L;
    }
}
