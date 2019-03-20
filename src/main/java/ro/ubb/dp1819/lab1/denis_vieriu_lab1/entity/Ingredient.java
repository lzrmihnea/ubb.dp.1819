package ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity;

import java.util.Objects;

public class Ingredient {
    private double quantity;
    private String unit;
    private String ingredient;
    private String adjective = "";

    public Ingredient(double _quantity, String _unit, String _ingredient)
    {
        this.quantity = _quantity;
        this.unit = _unit;
        this.ingredient = _ingredient;
    }

    public Ingredient(double _quantity, String _unit, String _ingredient, String _adjective)
    {
        this.quantity = _quantity;
        this.unit = _unit;
        this.ingredient = _ingredient;
        this.adjective = _adjective;
    }

    @Override
    public String toString() {
        String _adjective = (adjective.equals("") ? "" : ", " + adjective);
        return "Ingredient(" + quantity + ", " + unit + ", " + ingredient + _adjective + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit, ingredient, adjective);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Double.compare(that.quantity, quantity) == 0 &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(ingredient, that.ingredient) &&
                Objects.equals(adjective, that.adjective);
    }
}
