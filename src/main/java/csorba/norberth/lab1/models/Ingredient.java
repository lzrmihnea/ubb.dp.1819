package csorba.norberth.lab1.models;

public class Ingredient {
    private double quantity;
    private String unit;
    private String actualIngredient;
    private String adjective;

    public Ingredient(double quantity, String unit, String actualIngredient, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.actualIngredient = actualIngredient;
        this.adjective = adjective;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getActualIngredient() {
        return actualIngredient;
    }

    public String getAdjective() {
        return adjective;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", actualIngredient='" + actualIngredient + '\'' +
                ", adjective='" + adjective + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ingredient)) {
            return false;
        }

        Ingredient that = (Ingredient) obj;

        if(this.quantity != that.quantity){
            return false;
        }

        if(this.unit == null && that.unit != null || this.unit != null && that.unit == null){
            return false;
        }
        if(this.unit != null && that.unit != null && !this.unit.equals(that.unit)){
            return false;
        }

        if(this.actualIngredient == null && that.actualIngredient != null ||
                this.actualIngredient != null && that.actualIngredient == null){
            return false;
        }
        if(this.actualIngredient != null && that.actualIngredient != null && !this.actualIngredient.equals(that.actualIngredient)){
            return false;
        }

        if(this.adjective != null && that.adjective == null || this.adjective == null && that.adjective != null){
            return false;
        }
        if(this.adjective != null && that.adjective != null && !this.adjective.equals(that.adjective)){
            return false;
        }

        return true;
    }
}
