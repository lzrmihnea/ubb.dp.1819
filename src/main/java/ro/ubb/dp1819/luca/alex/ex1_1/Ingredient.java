package ro.ubb.dp1819.luca.alex.ex1_1;

import java.util.Objects;

public class Ingredient {
    private double quantity;
    private String unit;
    private String ingredientName;
    private String adjective;

    public Ingredient() {}

    public Ingredient(double quantity, String unit, String ingredientName, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredientName = ingredientName;
        this.adjective = adjective;
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

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Double.compare(that.quantity, quantity) == 0 &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(ingredientName, that.ingredientName) &&
                Objects.equals(adjective, that.adjective);
    }

    @Override
    public int hashCode() {

        return Objects.hash(quantity, unit, ingredientName, adjective);
    }
}
