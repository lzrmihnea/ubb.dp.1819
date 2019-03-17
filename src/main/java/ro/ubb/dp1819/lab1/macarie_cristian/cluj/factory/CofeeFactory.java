package ro.ubb.dp1819.lab1.macarie_cristian.cluj.factory;

import ro.ubb.cluj.domain.*;

import java.util.List;
import java.util.Optional;

public class CofeeFactory implements Factory {

    @Override
    public Optional<Coffee> prepareCoffee(List<Ingredient> ingredients) {
        Coffee coffee = null;
        if(Recipe.CAPPUCCINO.isEqual(ingredients)){
            coffee = Cappuccino.builder()
                    .waterCups(ingredients.get(0).getQuantity())
                    .roastedCoffeeBeanCups(ingredients.get(1).getQuantity())
                    .milk(ingredients.get(2).getQuantity())
                    .chocolate(ingredients.get(3).getQuantity())
                    .build();
        }
        if(Recipe.ESPRESSO.isEqual(ingredients)){
            coffee = Espresso.builder()
                    .waterCups(ingredients.get(0).getQuantity())
                    .roastedCoffeeBeanCups(ingredients.get(1).getQuantity())
                    .build();
        }
        if(Recipe.CHOCOLATO.isEqual(ingredients)){
            coffee = Chocolato.builder()
                    .waterCups(ingredients.get(0).getQuantity())
                    .roastedCoffeeBeanCups(ingredients.get(1).getQuantity())
                    .chocolate(ingredients.get(2).getQuantity())
                    .build();
        }
        if(Recipe.LATTE.isEqual(ingredients)){
            coffee = Latte.builder()
                    .waterCups(ingredients.get(0).getQuantity())
                    .roastedCoffeeBeanCups(ingredients.get(1).getQuantity())
                    .milk(ingredients.get(2).getQuantity())
                    .build();
        }
        return Optional.ofNullable(coffee);
    }
}
