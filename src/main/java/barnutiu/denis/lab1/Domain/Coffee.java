package barnutiu.denis.lab1.Domain;


import java.util.List;

public class Coffee {

    private String type;
    private List<CoffeeIngredient> ingredients;

    public Coffee(String type, List<CoffeeIngredient> ingredients) {
        this.type = type;
        this.ingredients = ingredients;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<CoffeeIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<CoffeeIngredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString(){
        String string=type+" with ingredients:";

        for(CoffeeIngredient coffeeIngredient:ingredients) {

            string += coffeeIngredient.toString() + ";";
        }
        return string;
    }
}
