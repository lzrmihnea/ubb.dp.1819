package csorba.norberth.lab1.factory;

import csorba.norberth.lab1.models.*;

import java.lang.reflect.InvocationTargetException;
import java.security.InvalidParameterException;
import java.util.List;

public class CoffeeFactory implements ICoffeeFactory {
    @Override
    public Coffee create(List<Ingredient> inputIngredients) throws ClassNotFoundException {
        for (CoffeeType coffeeType : CoffeeType.values()) {
            if (compareIngredientLists(inputIngredients, coffeeType.ingredients)) {
                try {
                    return (Coffee) coffeeType.coffeeClass.getConstructor(List.class).newInstance(inputIngredients);
                } catch (InvocationTargetException | NoSuchMethodException |
                        InstantiationException | IllegalAccessException ex) {
                    throw new ClassNotFoundException();
                }
            }
        }
        throw new InvalidParameterException();
    }

    private boolean compareIngredientLists(List<Ingredient> ingredientList, Ingredient[] ingredientArray) {
        if (ingredientList.size() != ingredientArray.length) {
            return false;
        }
        for (int i = 0; i < ingredientArray.length; i++) {
            if (!ingredientArray[i].equals(ingredientList.get(i))) {
                return false;
            }
        }
        return true;
    }

    private enum CoffeeType {
        ESPRESSO(new Ingredient[]{
                new Ingredient(2, "cups", "water", null),
                new Ingredient(0.25, "cups", "coffee-beans", "roasted")
        }, Espresso.class),
        CAPUCCINO(new Ingredient[]{
                new Ingredient(2, "cups", "water", null),
                new Ingredient(0.25, "cups", "coffee-beans", "roasted"),
                new Ingredient(100, "ml", "milk", "foamed")
        }, Capuccino.class),
        AMERICANO(new Ingredient[]{
                new Ingredient(4, "cups", "water", null),
                new Ingredient(0.25, "cups", "coffee-beans", "roasted")
        }, Americano.class);

        private Ingredient[] ingredients;
        private Class coffeeClass;

        CoffeeType(Ingredient[] ingredients, Class coffeeClass) {
            this.ingredients = ingredients;
            this.coffeeClass = coffeeClass;
        }

        public Ingredient[] getIngredients() {
            return this.ingredients;
        }

        public Class getCoffeeClass() {
            return coffeeClass;
        }
    }
}
