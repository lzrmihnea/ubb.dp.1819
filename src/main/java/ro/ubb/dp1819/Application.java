package ro.ubb.dp1819;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ro.ubb.dp1819.panaite.dorinel.ex1.CoffeeDataInterpreter;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		AutowireCapableBeanFactory factory = context.getAutowireCapableBeanFactory();
		CoffeeDataInterpreter coffeeDataInterpreter = factory.getBean(CoffeeDataInterpreter.class);

	}

}
