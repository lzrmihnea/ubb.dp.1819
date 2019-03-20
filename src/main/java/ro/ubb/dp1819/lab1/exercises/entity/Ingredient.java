package ro.ubb.dp1819.lab1.exercises.entity;

public class Ingredient {
    private Double quantity;
    private UnitType unit;
    private IngredientType ingredient;
    private AdjectiveType adjective;

    public Ingredient() {
    }

    public Ingredient(Double quantity, UnitType unit, IngredientType ingredient, AdjectiveType adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.adjective = adjective;
        this.ingredient = ingredient;
    }

    public Ingredient(Double quantity, UnitType unit, IngredientType ingredient) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public IngredientType getIngredient() {
        return ingredient;
    }

    public void setIngredient(IngredientType ingredient) {
        this.ingredient = ingredient;
    }

    public UnitType getUnit() {
        return unit;
    }

    public void setUnit(UnitType unit) {
        this.unit = unit;
    }

    public AdjectiveType getAdjective() {
        return adjective;
    }

    public void setAdjective(AdjectiveType adjective) {
        this.adjective = adjective;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "quantity=" + quantity +
                ", unit=" + unit +
                ", ingredient='" + ingredient + '\'' +
                ", adjective='" + adjective + '\'' +
                '}';
    }
}
