package ro.ubb.dp1819.panaite.dorinel.ex1;

public class CoffeeIngredients {
    private double quantity;
    private String unit;
    private String ingredient;
    private String adjective;

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
    public String toString() {
        return adjective != null ? "CoffeeIngredients{" +
                "quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", adjective='" + adjective + '\'' +
                '}' : "CoffeeIngredients{" +
                "quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", ingredient='" + ingredient + '\'' +
                '}';
    }
}
