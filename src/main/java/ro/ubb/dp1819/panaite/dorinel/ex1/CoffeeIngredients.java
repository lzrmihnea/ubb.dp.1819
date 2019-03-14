package ro.ubb.dp1819.panaite.dorinel.ex1;

import java.util.Objects;

public class CoffeeIngredients extends BaseCoffeeIngredients {
    private double quantity;
    private String unit;
    private String ingredient;
    private String adjective;

    public CoffeeIngredients() {

    }

    public CoffeeIngredients(double quantity, String unit, String ingredient) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
    }

    public CoffeeIngredients(double quantity, String unit, String ingredient, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
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

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
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
        CoffeeIngredients that = (CoffeeIngredients) o;
        return Double.compare(that.quantity, quantity) == 0 &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(ingredient, that.ingredient) &&
                Objects.equals(adjective, that.adjective);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit, ingredient, adjective);
    }

    @Override
    public String toString() {
        return adjective != null ?
                quantity +
                        " " + unit +
                        " " + ingredient +
                        " " + adjective :
                quantity +
                        " " + unit +
                        " " + ingredient;
    }
}
