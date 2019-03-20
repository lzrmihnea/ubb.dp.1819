package ro.ubb.dp1819.lab1.denis_vieriu_lab1.entity;

public class IngredientBuilder {
    private double quantity;
    private String unit;
    private String ingredient;
    private String adjective = null;

    public IngredientBuilder setQuantity(double quantity) {
        this.quantity = quantity;
        return this;
    };

    public IngredientBuilder setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public IngredientBuilder setIngredient(String ingredient) {
        this.ingredient = ingredient;
        return this;
    }

    public IngredientBuilder setAdjective(String adjective) {
        this.adjective = adjective;
        return this;
    }

    public Ingredient build() {
        return (adjective == null) ?
                new Ingredient(this.quantity, this.unit, this.ingredient) :
                new Ingredient(this.quantity, this.unit, this.ingredient, this.adjective);
    }
}
