package csorba.norberth.lab2.exercises.component;

public class Wheel implements CarComponent {
    private String type;

    public Wheel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public Long getPrice() {
        return (long)50;
    }

    @Override
    public String toString() {
        return type + " Wheel";
    }
}
