package ro.ubb.dp1819.lab1.exercises.entity;

import java.util.Objects;

public class Ingredient {

    private double quantity;
    private String unit;
    private String name;
    private String adjective;

    private Ingredient(double quantity, String unit, String name, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.name = name;
        this.adjective = adjective;
    }

    public String getName() {
        return name;
    }

    public static IngredientBuilder builder() {
        return new IngredientBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Ingredient that = (Ingredient) o;

        return Double.compare(that.quantity, quantity) == 0 &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(name, that.name) &&
                Objects.equals(adjective, that.adjective);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit, name, adjective);
    }

    @Override
    public String toString() {
        return "" + quantity + " " + unit + " " + name + " " + adjective;
    }

    public static class IngredientBuilder {

        private double quantity;
        private String unit;
        private String name;
        private String adjective;

        private IngredientBuilder() {
        }

        public IngredientBuilder quantity(double quantity) {
            this.quantity = quantity;
            return this;
        }

        public IngredientBuilder unit(String unit) {
            this.unit = unit;
            return this;
        }

        public IngredientBuilder name(String name) {
            this.name = name;
            return this;
        }

        public IngredientBuilder adjective(String adjective) {
            this.adjective = adjective;
            return this;
        }

        public Ingredient build() {
            return new Ingredient(quantity, unit, name, adjective);
        }

    }

}
