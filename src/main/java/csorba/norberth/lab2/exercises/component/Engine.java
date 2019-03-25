package csorba.norberth.lab2.exercises.component;

public class Engine implements CarComponent {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public Long getPrice() {
        return (long)1000;
    }

    @Override
    public String toString() {
        return type + " Engine";
    }
}
