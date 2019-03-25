package csorba.norberth.lab2.exercises.component;

public class Paint implements CarComponent {
    private String color;

    public Paint(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public Long getPrice() {
        return (long)100;
    }

    @Override
    public String toString() {
        return color + " Paint";
    }
}
