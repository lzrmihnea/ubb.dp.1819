package encapsulation;

public class Ingredient {
    private double quantity;
    private String unit;
    private String ingredient;
    private String adjective;

    public Ingredient(double quantity, String unit, String ingredient) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
        this.adjective = "";
    }

    public Ingredient(double quantity, String unit, String ingredient, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
        this.adjective = adjective;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getAdjective() {
        return adjective;
    }

    public String getIngredient() {
        return ingredient;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object obj) {
        Ingredient other = (Ingredient) obj;
        if(
            other.getIngredient().equals(this.ingredient) &&
            other.getQuantity() == this.getQuantity() &&
            other.getUnit().equals(this.unit) &&
            other.getAdjective().equals(this.adjective)
        ) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return ""+quantity+" "+unit+" "+ingredient+" "+adjective;
    }
}
