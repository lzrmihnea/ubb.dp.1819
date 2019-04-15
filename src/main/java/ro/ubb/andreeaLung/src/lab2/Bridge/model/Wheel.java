package lab2.Bridge.model;

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
}
