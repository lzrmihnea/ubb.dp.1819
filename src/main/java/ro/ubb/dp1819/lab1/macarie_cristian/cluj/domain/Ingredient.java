package ro.ubb.dp1819.lab1.macarie_cristian.cluj.domain;

public class Ingredient {
    private Double quantity;
    private String unit;
    private String name;
    private String adjective;

    public Ingredient(Double quantity, String unit, String name, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.name = name;
        this.adjective = adjective;
    }

    public Double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public String getAdjective() {
        return adjective;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingredient that = (Ingredient) o;

        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return adjective != null ? adjective.equals(that.adjective) : that.adjective == null;
    }

    @Override
    public int hashCode() {
        int result = quantity != null ? quantity.hashCode() : 0;
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (adjective != null ? adjective.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", name='" + name + '\'' +
                ", adjective='" + adjective + '\'' +
                '}';
    }

    public static Ingredient.IngredientBuilder builder() {return new IngredientBuilder();}

    public static class IngredientBuilder {
        private Double quantity;
        private String unit;
        private String name;
        private String adjective;

        public IngredientBuilder quantity(Double quantity) {
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
            return new Ingredient(this.quantity, this.unit, this.name, this.adjective);
        }

    }
}
