package ro.ubb.dezsi.imola.lab1.ex3Builder.main;

public class Main {

	public static void main(String[] args) {
		Coffee coffee = new CoffeeBuilder()
				.builder()
				.addWater(2.5)
				.addCoffeeCups(2)
				.addIce()
				.build();
		System.out.println(coffee);

		Coffee coffee1 = new CoffeeBuilder()
				.builder()
				.addWater(2)
				.addCoffeeCups(2)
				.addFoamedMilk(5)
				.build();
		System.out.println(coffee1);

		Coffee coffee2 = new CoffeeBuilder()
				.builder()
				.addWater(2)
				.addCoffeeCups(2)
				.build();
		System.out.println(coffee2);
	}

}
