package ro.ubb.dezsi.imola.lab1.ex2CoffeeFactory.main;


public class Main {
	
	public static void main(String[] args) {
		CoffeeFactory fact  = new CoffeeFactory();
		ICoffee coffee = fact.GetCoffee(2, 0.25, 0, false);
		if (coffee != null)
			System.out.println(coffee.getType());
		else
			System.out.println("Sorry, no such coffee");
	}
}
