package lab2.Bridge.model;

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
}
