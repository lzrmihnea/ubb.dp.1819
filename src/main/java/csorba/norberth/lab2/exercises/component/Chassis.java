package csorba.norberth.lab2.exercises.component;

public class Chassis implements CarComponent {
    private String material;

    public Chassis(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public Long getPrice() {
        return (long)200;
    }

    @Override
    public String toString() {
        return material + " Chassis";
    }
}
