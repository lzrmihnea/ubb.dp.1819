package lab2.Bridge.model;

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
}
