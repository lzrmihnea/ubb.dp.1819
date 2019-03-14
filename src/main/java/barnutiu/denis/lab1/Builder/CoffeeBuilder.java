package barnutiu.denis.lab1.Builder;


import barnutiu.denis.lab1.Domain.Coffee;
import barnutiu.denis.lab1.Domain.CoffeeIngredient;
import barnutiu.denis.lab1.Factory.CoffeeFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class CoffeeBuilder {

    protected List<CoffeeIngredient> coffeeIngredients;
    private CoffeeFactory coffeeFactory;

    public CoffeeBuilder(){

        this.coffeeIngredients=new ArrayList<>();
        this.coffeeFactory=new CoffeeFactory();
    }

    public Coffee getCoffee(){

        return this.coffeeFactory.getCoffee(coffeeIngredients);
    }

    public abstract void  addIngredients();


}
