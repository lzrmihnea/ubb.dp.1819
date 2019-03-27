package ro.ubb.dp1819.lab2.exercises.component;

public class Chassis implements CarComponent {
    private String material;

    public Chassis(String material) {
        this.material = material;
    }

    @Override
    public Long getPrice() {
        return 2000L;
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "material='" + material + '\'' +
                '}';
    }
}
