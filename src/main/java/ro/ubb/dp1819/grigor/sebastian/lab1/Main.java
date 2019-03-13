package ro.ubb.dp1819.grigor.sebastian.lab1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ro.ubb.dp1819.grigor.sebastian.lab1.drinks.Drink;
import ro.ubb.dp1819.grigor.sebastian.lab1.drinks.Ingredient;
import ro.ubb.dp1819.grigor.sebastian.lab1.services.*;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Main implements CommandLineRunner {
    @Override
    public void run(String... args) {
        main(args);
    }

    public static void main(String[] args) {
        File file = new File("src/main/java/ro/ubb/dp1819/grigor/sebastian/lab1/recipe.txt");

        FileReader fileReader = new FileReaderImpl();
        IngredientParser ingredientParser = new IngredientParserImpl();

        List<Ingredient> ingredients = fileReader.read(file).stream()
                .map(ingredientParser::parse)
                .collect(Collectors.toList());

        DrinkFactory drinkFactory = new DrinkFactoryImpl();
        Drink drink1 = drinkFactory.makeDrink(ingredients);
        drink1.drink();

        DrinkBuilder drinkBuilder = new DrinkBuilderImpl();
        Drink drink2 = drinkBuilder.addIngredient("2", "cups", "water")
                .addIngredient("0.25", "cups", "coffee-beans", "roasted")
                .addIngredient("100","ml","milk","foamed")
                .build();
        drink2.drink();
    }
}
