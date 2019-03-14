package barnutiu.denis.lab1.Builder;


import barnutiu.denis.lab1.Domain.CoffeeIngredient;

public class AmericanoBuilder extends CoffeeBuilder{

    @Override
    public void addIngredients(){
        coffeeIngredients.add(new CoffeeIngredient(4,"cups","water"));
        coffeeIngredients.add(new CoffeeIngredient(0.25,"cups","coffee-beans","roasted"));
    }
}
