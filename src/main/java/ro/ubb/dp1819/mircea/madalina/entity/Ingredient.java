package ro.ubb.dp1819.mircea.madalina.entity;

/**
 * Created by Madalina Mircea on 3/12/2019.
 */
public class Ingredient {
    private String name;
    private double quantity;
    private String unit;
    private String adjective = "";

    public Ingredient(String name, double quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }

    public Ingredient(String name, double quantity, String unit, String adjective) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.adjective = adjective;
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
        return adjective != null ? adjective.equals(that.adjective) : that.adjective == null;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}