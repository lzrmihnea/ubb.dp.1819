package ro.ubb.dp1819.lab1.exercises.entity;

import java.util.Objects;

public class Ingredient {

    public Ingredient() {
    }

    public Ingredient(float quantity, String unit, String ingredient, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
        this.adjective = adjective;
    }

    private float quantity;

    private String unit;

    private String ingredient;

    private String adjective;

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
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

    public static class Builder{

        private Ingredient ingredient = new Ingredient();
        public Builder() {
        }

        public Builder setIngredient(String ingredient){
            this.ingredient.ingredient = ingredient;
            return this;
        }

        public Builder setAdjective(String adjective){
            this.ingredient.adjective = adjective;
            return this;
        }
        public Builder setQuantity(float quantity){
            this.ingredient.quantity = quantity;
            return this;
        }
        public Builder setQuantity(String quantity){
            this.ingredient.quantity = Float.parseFloat(quantity);
            return this;
        }
        public Builder setUnit(String unit){
            this.ingredient.unit = unit;
            return this;
        }
        public Ingredient build(){
            return ingredient;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Float.compare(that.quantity, quantity) == 0 &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(ingredient, that.ingredient) &&
                Objects.equals(adjective, that.adjective);
    }

    @Override
    public int hashCode() {

        return Objects.hash(quantity, unit, ingredient, adjective);
    }
}
