package csorba.norberth.lab2.models;

public class CarPart {
    private int quantity;
    private String type;
    private String component;

    public CarPart(int quantity, String type, String component) {
        this.quantity = quantity;
        this.type = type;
        this.component = component;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    @Override
    public String toString() {
        return "CarPart{" +
                "quantity=" + quantity +
                ", type='" + type + '\'' +
                ", component='" + component + '\'' +
                '}';
    }
}
