package popa.catalin.lab1.domain;

import java.util.Objects;

public class Ingredient {
    private Float quantity;
    private String unit;
    private String name;
    private String adjective;

    public Ingredient(Float quantity, String unit, String name) {
        this.quantity = quantity;
        this.unit = unit;
        this.name = name;
    }

    public Ingredient(Float quantity, String unit, String name, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.name = name;
        this.adjective = adjective;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    @Override
    public String toString() {
        if (adjective != null)
            return "Ingredient{" +
                    "quantity=" + quantity +
                    ", unit='" + unit + '\'' +
                    ", name='" + name + '\'' +
                    ", adjective='" + adjective + '\'' +
                    '}';
        else
            return "Ingredient{" +
                    "quantity=" + quantity +
                    ", unit='" + unit + '\'' +
                    ", name='" + name + '\'' +
                    '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredient)) return false;
        Ingredient that = (Ingredient) o;
        return quantity.equals(that.quantity) &&
                unit.equals(that.unit) &&
                name.equals(that.name) &&
                Objects.equals(adjective, that.adjective);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit, name, adjective);
    }
}
