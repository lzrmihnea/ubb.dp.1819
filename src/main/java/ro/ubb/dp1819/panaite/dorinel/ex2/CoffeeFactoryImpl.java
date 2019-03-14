package ro.ubb.dp1819.panaite.dorinel.ex2;

import ro.ubb.dp1819.panaite.dorinel.ex1.BaseCoffeeIngredients;
import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeDataInterpreter;
import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeDataInterpreterException;

public class CoffeeFactoryImpl implements CoffeeFactory {
    private CoffeeDataInterpreter coffeeDataInterpreter;

    public CoffeeFactoryImpl(CoffeeDataInterpreter coffeeDataInterpreter) {
        this.coffeeDataInterpreter = coffeeDataInterpreter;
    }

    @Override
    public Coffee brewCoffee(String coffeeInputString) throws CoffeeDataInterpreterException {
        BaseCoffeeIngredients coffeeIngredients = coffeeDataInterpreter.getIngredientsFromLine(coffeeInputString);

        if (coffeeIngredients.equals(Coffee.AMERICANO))
            return new Americano();
        else if (coffeeIngredients.equals(Coffee.CAPPUCCINO))
            return new Cappuccino();
        else if (coffeeIngredients.equals(Coffee.ESPRESSO))
            return new Espresso();
        else if (coffeeIngredients.equals(Coffee.LATTE))
            return new Latte();
        else throw new CoffeeDataInterpreterException("This type of coffee is non-existent");
    }
}
