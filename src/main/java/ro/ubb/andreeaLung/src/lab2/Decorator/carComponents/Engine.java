package lab2.Decorator.carComponents;

public class Engine implements CarComponent {
    String type;

    public Engine(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public Long getPrice() {
        return 200L;
    }
}
