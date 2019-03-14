package barnutiu.denis.lab1.Builder;


import barnutiu.denis.lab1.Domain.CoffeeIngredient;

public class EspressoBuilder extends CoffeeBuilder{

    @Override
    public void addIngredients(){
        coffeeIngredients.add(new CoffeeIngredient(2,"cups","water"));
        coffeeIngredients.add(new CoffeeIngredient(0.25,"cups","coffee-beans","roasted"));


    }
}
