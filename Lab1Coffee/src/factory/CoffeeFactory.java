package factory;

import builder.CoffeeBuilder;
import encapsulation.Ingredient;

import java.util.List;

public class CoffeeFactory {
    static Ingredient iEsCaIr1 = new Ingredient(2, "cups", "water");
    static Ingredient iEsCaAmIr2 = new Ingredient(0.25, "cups", "coffee-beans", "roasted");

    static Ingredient iCa = new Ingredient(100, "ml", "milk", "foamed");

    static Ingredient iAm = new Ingredient(4, "cups", "coffee-beans", "roasted");

    static Ingredient iIr = new Ingredient(15, "ml", "whiskey");

    static CoffeeBuilder coBuilder = new CoffeeBuilder();

    public static Coffee getCoffee(List<Ingredient> ingredients) {

       switch (ingredients.size()){
           case 2:
               if(ingredients.contains(iEsCaIr1) && ingredients.contains(iEsCaAmIr2)){
                   return coBuilder
                           .name("Espresso")
                           .withIngradients(ingredients)
                           .build();
               }
               if(ingredients.contains(iEsCaAmIr2) && ingredients.contains(iAm)){
                   return coBuilder
                           .name("Americano")
                           .withIngradients(ingredients)
                           .build();
               }
               break;
           case 3:
               if(ingredients.contains(iEsCaAmIr2) && ingredients.contains(iEsCaIr1) && ingredients.contains(iCa)){
                   return coBuilder
                           .name("Cappuccino")
                           .withIngradients(ingredients)
                           .build();
               }
               if(ingredients.contains(iEsCaAmIr2) && ingredients.contains(iEsCaIr1) && ingredients.contains(iIr)){
                   return coBuilder
                           .name("Irish")
                           .withIngradients(ingredients)
                           .build();
               }
               break;

       }

       return null;
    }
}
