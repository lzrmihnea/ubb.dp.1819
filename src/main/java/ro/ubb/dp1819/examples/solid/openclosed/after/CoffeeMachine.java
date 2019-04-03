package ro.ubb.dp1819.examples.solid.openclosed.after;

import ro.ubb.dp1819.examples.solid.openclosed.common.Coffee;
import ro.ubb.dp1819.examples.solid.openclosed.common.CoffeeException;
import ro.ubb.dp1819.examples.solid.openclosed.common.CoffeeSelection;

public interface CoffeeMachine {
	Coffee brewCoffee(CoffeeSelection selection) throws CoffeeException;
}