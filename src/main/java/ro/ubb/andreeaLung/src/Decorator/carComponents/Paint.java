package Decorator.carComponents;

public class Paint implements CarComponent {
    String type;

    public Paint(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Paint{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public Long getPrice() {
        return 10L;
    }
}
