package Pb1;

public class Ingredient {
    private String name;
    private Double quantity;
    private String unit;
    private String adjective;

    public Ingredient(String name, Double quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.adjective = "";
    }

    public Ingredient(String name, Double quantity, String unit, String adjective) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.adjective = adjective;
    }

    public String getName() {
        return name;
    }

    public Double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    @Override
    public String toString() {
        return quantity + " " + unit + " " + name + " " + adjective;
    }

    @Override
    public boolean equals(Object obj) {
        Ingredient ingredient = (Ingredient)obj;
        if(this.name.equals(ingredient.name) &&
                this.quantity.equals(ingredient.quantity) &&
                this.unit.equals(ingredient.unit) &&
                this.adjective.equals(ingredient.adjective)) {
            return true;
        }
        return false;
    }
}
