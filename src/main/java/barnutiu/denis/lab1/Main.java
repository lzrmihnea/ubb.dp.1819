package barnutiu.denis.lab1;

import barnutiu.denis.lab1.Builder.AmericanoBuilder;
import barnutiu.denis.lab1.Builder.CoffeeBuilder;

public class Main {

    public static void main(String args[]){
        CoffeeBuilder builder=new AmericanoBuilder();
        builder.addIngredients();
        System.out.println(builder.getCoffee());
    }
}
