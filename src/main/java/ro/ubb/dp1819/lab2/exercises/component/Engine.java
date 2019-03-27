package ro.ubb.dp1819.lab2.exercises.component;

public class Engine implements CarComponent {
    private String type;

    public Engine(String type) {
        this.type = type;
    }


    @Override
    public Long getPrice() {
        return 4000L;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                '}';
    }
}
