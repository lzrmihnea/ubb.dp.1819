import exceptions.CoffeeException;
import services.IOService;
import services.IngredientService;
import services.impl.CoffeeTypes;
import services.impl.IngredientServiceImpl;
import services.impl.IoServiceImpl;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, CoffeeException {
		String file = "C:\\Users\\podar\\workspace\\dp\\lab01\\src\\main\\java\\espresso.in";
		IngredientService ingredientService = IngredientServiceImpl.getInstance();

		CoffeeTypes types = CoffeeTypes.identifyType(ingredientService.readIngredients(file));

//		List<String> res = ioService.readFile("C:\\Users\\podar\\workspace\\dp\\lab01\\src\\main\\java\\espresso.in");

		if (types != null)
			System.out.println("The coffee type is " + types.getName());
		else
			System.out.println("Unable to identify type");
	}
}
