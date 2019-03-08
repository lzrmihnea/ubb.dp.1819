/*
 * Example source code:
 * https://github.com/thjanssen/Stackify-SOLID-Liskov
 */
package ro.ubb.dp1819.examples.solid.liskov.coffeemachine;

public class Grinder {

	public GroundCoffee grind(CoffeeBean coffeeBean, double quantityCoffee) {
		return new GroundCoffee(coffeeBean.getName(), quantityCoffee);
	}

}
