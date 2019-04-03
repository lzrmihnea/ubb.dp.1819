package ro.ubb.dp1819.examples.solid.interfacesegregation;

public interface CoffeeMachine {
	CoffeeDrink brewFilterCoffee() throws CoffeeException;

	void addGroundCoffee(GroundCoffee newCoffee) throws CoffeeException;

	CoffeeDrink brewEspresso() throws CoffeeException;
}
