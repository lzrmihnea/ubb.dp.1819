package ro.ubb.dp1819.fulea.razvan.lab2.adapter;

public class Coffee {
    private String name;
    private String brand;
    private String type;
    private String origin;

    public Coffee() {
    }

    public Coffee(String name, String brand, String type, String origin) {
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
