package ro.ubb.dp1819.lab2.exercises.component;

public class Paint implements CarComponent {
    private String color;

    public Paint(String color) {
        this.color = color;
    }


    @Override
    public Long getPrice() {
        return 1000L;
    }

    @Override
    public String toString() {
        return "Paint{" +
                "color='" + color + '\'' +
                '}';
    }
}
