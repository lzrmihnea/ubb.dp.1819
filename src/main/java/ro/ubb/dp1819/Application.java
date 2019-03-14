package ro.ubb.dp1819;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ro.ubb.dp1819.panaite.dorinel.ex1.BaseCoffeeIngredients;
import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeDataInterpreter;
import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeDataInterpreterException;
import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeIngredients;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		AutowireCapableBeanFactory factory = context.getAutowireCapableBeanFactory();
		CoffeeDataInterpreter coffeeDataInterpreter = factory.getBean(CoffeeDataInterpreter.class);

		try {
			List<BaseCoffeeIngredients> ingredientsList = coffeeDataInterpreter.getCoffee("/Users/vanpana/Documents/Personal/Programming/ubb.dp.1819/src/main/resources/coffee-ingreds.in");
			ingredientsList.forEach(System.out::println);
		} catch (CoffeeDataInterpreterException e) {
			e.printStackTrace();
		}
	}

}
