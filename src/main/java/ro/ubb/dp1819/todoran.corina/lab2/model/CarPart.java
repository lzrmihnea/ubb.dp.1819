package ro.ubb.dp1819.todoran.corina.lab2.model;

import java.util.Objects;

public class CarPart {
    private int quantity;
    private String type;
    private String component;

    public CarPart(int quantity, String type, String component) {
        this.quantity = quantity;
        this.type = type;
        this.component = component;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarPart)) return false;
        CarPart carPart = (CarPart) o;
        return quantity == carPart.quantity &&
                type.equals(carPart.type) &&
                component.equals(carPart.component);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, type, component);
    }

    @Override
    public String toString() {
        return "CarPart { " +
                "quantity=" + quantity +
                ", type='" + type + '\'' +
                ", component='" + component + '\'' +
                " }";
    }

    public String getComponent() {
        return component;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }
}
