package ro.ubb.dp1819.todoran.corina.lab1.model;

import java.util.Objects;

public class Ingredient {
    private String name;
    private double quantity;
    private String unit;
    private String adjective = "";


    public Ingredient(String name, double quantity, String unit, String adjective) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.adjective = adjective;
    }

    public Ingredient(String name, double quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return quantity + " " + unit + " " + name + " " + adjective;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingredient that = (Ingredient) o;

        if (Double.compare(that.quantity, quantity) != 0) return false;
        if (!name.equals(that.name)) return false;
        if (!unit.equals(that.unit)) return false;
        return Objects.equals(adjective, that.adjective);
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }
}
