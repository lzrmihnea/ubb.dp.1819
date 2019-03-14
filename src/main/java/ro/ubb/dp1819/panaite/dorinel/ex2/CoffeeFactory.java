package ro.ubb.dp1819.panaite.dorinel.ex2;

import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeDataInterpreterException;

public interface CoffeeFactory {
    Coffee brewCoffee(String coffeeInputString) throws CoffeeDataInterpreterException;
}
