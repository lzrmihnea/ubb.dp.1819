package ro.ubb.dp1819;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ro.ubb.dp1819.panaite.dorinel.lab1.ex1.BaseCoffeeIngredients;
import ro.ubb.dp1819.panaite.dorinel.lab1.ex3.CoffeeBuilder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		AutowireCapableBeanFactory factory = context.getAutowireCapableBeanFactory();

//		try {
////			EX 1
////			CoffeeDataInterpreter coffeeDataInterpreter = factory.getBean(CoffeeDataInterpreter.class);
////			List<BaseCoffeeIngredients> ingredientsList = coffeeDataInterpreter.getCoffee("/Users/vanpana/Documents/Personal/Programming/ubb.dp.1819/src/main/resources/coffee-ingreds.in");
////			ingredientsList.forEach(System.out::println);
//
////			EX 2
////			CoffeeFactory coffeeFactory = factory.getBean(CoffeeFactory.class);
////			Coffee brewedCappuccino = coffeeFactory.brewCoffee("2 cups water + 0.25 cups coffee-beans roasted + 100 ml milk foamed");
////			Coffee brewedLatte = coffeeFactory.brewCoffee("200 ml milk foamed + 0.25 cups coffee-beans roasted");
////
////			System.out.println(brewedCappuccino.getCoffeeType());
////			System.out.println(brewedLatte.getCoffeeType());
//
//		} catch (CoffeeDataInterpreterException e) {
//			e.printStackTrace();
//		}

		CoffeeBuilder coffeeBuilder = new CoffeeBuilder();
		BaseCoffeeIngredients singleIngredients = coffeeBuilder.quantity(2)
				.unit("ml")
				.ingredient("milk")
				.adjective("foamed")
				.build();

		BaseCoffeeIngredients compoundIngredients = coffeeBuilder.quantity(2)
				.unit("ml")
				.ingredient("milk")
				.adjective("foamed")
				.newIngredients()
				.quantity(12)
				.unit("cups")
				.ingredient("coffee-beans")
				.build();

		BaseCoffeeIngredients extraCompoundIngredients = coffeeBuilder.quantity(2)
				.unit("ml")
				.ingredient("milk")
				.adjective("foamed")
				.newIngredients()
				.quantity(12)
				.unit("cups")
				.ingredient("coffee-beans")
				.newIngredients()
				.quantity(42)
				.unit("ml")
				.ingredient("syrup")
				.adjective("sweet")
				.build();

		System.out.println(singleIngredients);
		System.out.println(compoundIngredients);
		System.out.println(extraCompoundIngredients);
	}

}
