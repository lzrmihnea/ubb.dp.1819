/*
 * Example source code:
 * https://github.com/thjanssen/Stackify-SOLID-Liskov
 */
package ro.ubb.dp1819.examples.solid.liskov.coffeemachine;

public interface CoffeeMachine {
	
	CoffeeDrink brewCoffee(CoffeeSelection selection) throws CoffeeException;
}