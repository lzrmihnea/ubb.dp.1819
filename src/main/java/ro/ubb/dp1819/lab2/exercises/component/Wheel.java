package ro.ubb.dp1819.lab2.exercises.component;

public class Wheel implements CarComponent {
    private String type;

    public Wheel(String type) {
        this.type = type;
    }

    @Override
    public Long getPrice() {
        return 1500L;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "type='" + type + '\'' +
                '}';
    }
}
