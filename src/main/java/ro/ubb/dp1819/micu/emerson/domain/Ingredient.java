package ro.ubb.dp1819.micu.emerson.domain;

import java.util.Objects;

public class Ingredient implements Comparable<Ingredient> {
    private double quantity;
    private String unit;
    private String ingredient;
    private String adjective = "";

    public Ingredient(double quantity, String unit, String ingredient) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
    }

    public Ingredient(double quantity, String unit, String ingredient, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
        this.adjective = adjective;
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

    public static class IngredientBuilder{
        private double quantity;
        private String unit;
        private String ingredient;
        private String adjective = "";

        public IngredientBuilder setQuantity(double quantity){
            this.quantity = quantity;
            return this;
        }
        public IngredientBuilder setUnit(String unit){
            this.unit = unit;
            return this;
        }
        public IngredientBuilder setIngredient(String ingredient){
            this.ingredient = ingredient;
            return this;
        }
        public IngredientBuilder setAdjective(String adjective){
            this.adjective = adjective;
            return this;
        }
        public Ingredient build(){
            return adjective.length() > 0 ? new Ingredient(quantity,unit,ingredient,adjective) : new Ingredient(quantity, unit, ingredient);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit, ingredient, adjective);
    }

    @Override
    public int compareTo(Ingredient o) {
        return 1;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", adjective='" + adjective + '\'' +
                '}';
    }
}
