package barnutiu.denis.lab1.Factory;


import barnutiu.denis.lab1.Domain.Coffee;
import barnutiu.denis.lab1.Domain.CoffeeIngredient;

import java.util.List;

public class CoffeeFactory {


    public Coffee getCoffee(List<CoffeeIngredient> ingredients){


        if(ingredients.size()==2){

            if(ingredients.contains(new CoffeeIngredient(2,"cups","water")) && ingredients.contains(new CoffeeIngredient(0.25,"cups","coffee-beans","roasted")))
                return new Coffee("espresso",ingredients);
            if(ingredients.contains(new CoffeeIngredient(4,"cups","water")) && ingredients.contains(new CoffeeIngredient(0.25,"cups","coffee-beans","roasted")))
                return new Coffee("americano",ingredients);

        }
        else if(ingredients.size()==3){
            if(ingredients.contains(new CoffeeIngredient(2,"cups","water")) && ingredients.contains(new CoffeeIngredient(0.25,"cups","coffee-beans","roasted"))
                && ingredients.contains(new CoffeeIngredient(100,"ml","milk","foamed")))
                return new Coffee("cappuccino",ingredients);
            if(ingredients.contains(new CoffeeIngredient(2,"cups","water")) && ingredients.contains(new CoffeeIngredient(0.25,"cups","coffee-beans","roasted"))
                &&ingredients.contains(new CoffeeIngredient(0.06,"ml","whiskey")))
                return new Coffee("irish",ingredients);

        }


        return null;
    }
}
