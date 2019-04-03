package Decorator.carComponents;

public class Wheel implements CarComponent {
    String type;

    public Wheel(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public Long getPrice() {
        return 30L;
    }
}
