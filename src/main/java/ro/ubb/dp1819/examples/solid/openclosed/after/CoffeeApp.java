package ro.ubb.dp1819.examples.solid.openclosed.after;

import java.util.HashMap;
import java.util.Map;

import ro.ubb.dp1819.examples.solid.openclosed.common.Coffee;
import ro.ubb.dp1819.examples.solid.openclosed.common.CoffeeBean;
import ro.ubb.dp1819.examples.solid.openclosed.common.CoffeeException;
import ro.ubb.dp1819.examples.solid.openclosed.common.CoffeeSelection;

public class CoffeeApp {

	private CoffeeMachine coffeeMachine;

	public CoffeeApp(CoffeeMachine coffeeMachine) {
		this.coffeeMachine = coffeeMachine;
	}

	public Coffee prepareCoffee(CoffeeSelection selection) throws CoffeeException {
		Coffee coffee = this.coffeeMachine.brewCoffee(selection);
		System.out.println("Coffee is ready!");
		return coffee;
	}

	public static void main(String[] args) {
    // create a Map of available coffee beans
    Map<CoffeeSelection, CoffeeBean> beans = new HashMap<CoffeeSelection, CoffeeBean>();
    beans.put(CoffeeSelection.ESPRESSO, new CoffeeBean(
        "My favorite espresso bean", 1000));
    beans.put(CoffeeSelection.FILTER_COFFEE, new CoffeeBean(
        "My favorite filter coffee bean", 1000));

    // get a new CoffeeMachine object
    PremiumCoffeeMachine machine = new PremiumCoffeeMachine(beans);

    // Instantiate CoffeeApp
    CoffeeApp app = new CoffeeApp(machine);

    // brew a fresh coffee
    try {
        app.prepareCoffee(CoffeeSelection.ESPRESSO);
    } catch (CoffeeException e) {
        e.printStackTrace();
    }
    } // end main
}
