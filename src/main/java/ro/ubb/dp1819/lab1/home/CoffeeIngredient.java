package ro.ubb.dp1819.lab1.home;

public class CoffeeIngredient {
    private int quantity;
    private String unit;
    private String ingredient;
    private String adjective;

    public CoffeeIngredient(int quantity, String unit, String ingredient, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
        this.adjective = adjective;
    }

    public CoffeeIngredient(int quantity, String unit, String ingredient) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
        this.adjective = "unavailable";
    }

    @Override
    public String toString() {
        return "CoffeeIngredient{" +
                "quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", adjective='" + adjective + '\'' +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
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

    public static class Builder {
        private int quantity;
        private String unit;
        private String ingredient;
        private String adjective;

        public Builder() {
        }

        public CoffeeIngredient buid(){
            return new CoffeeIngredient(quantity,unit,ingredient,adjective);
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = unit;
            return this;
        }

        public Builder setIngredient(String ingredient) {
            this.ingredient = ingredient;
            return this;
        }

        public Builder setAdjective(String adjective) {
            this.adjective = adjective;
            return this;
        }
    }
}
