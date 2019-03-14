package barnutiu.denis.lab1.Domain;

public class CoffeeIngredient {

    private double quantity;
    private String unit;
    private String ingredient;
    private String adjective;

    public CoffeeIngredient(){
        this.quantity=0.0;
        this.unit="";
        this.ingredient="";
        this.adjective="";
    }

    public CoffeeIngredient(double quantity, String unit, String ingredient, String adjective) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
        this.adjective = adjective;
    }

    public CoffeeIngredient(double quantity, String unit, String ingredient) {
        this.quantity = quantity;
        this.unit = unit;
        this.ingredient = ingredient;
        this.adjective="";
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


    public boolean equals(Object object){
        CoffeeIngredient coffeeIngredient=(CoffeeIngredient)object;

        if(this.quantity==coffeeIngredient.quantity && this.unit.equals(coffeeIngredient.unit) && this.ingredient.equals(coffeeIngredient.ingredient) && this.adjective.equals(coffeeIngredient.adjective))
            return true;
        return false;
    }

    @Override
    public String toString(){
        return quantity+" "+unit+" "+ingredient+" "+adjective;
    }
}
