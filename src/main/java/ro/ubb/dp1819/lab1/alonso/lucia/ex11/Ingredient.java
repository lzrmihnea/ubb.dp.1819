package ro.ubb.dp1819.lab1.alonso.lucia.ex11;

import java.util.Objects;

public class Ingredient {

    private double quantity;
    private String unit;
    private String ingreidient;
    private String adjective;

    public Ingredient(double quantity, String unit, String ingreidient, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingreidient = ingreidient;
        this.adjective = adjective;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getIngreidient() {
        return ingreidient;
    }

    public String getAdjective() {
        return adjective;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", ingreidient='" + ingreidient + '\'' +
                ", adjective='" + adjective + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return quantity == that.quantity &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(ingreidient, that.ingreidient) &&
                Objects.equals(adjective, that.adjective);
    }

}