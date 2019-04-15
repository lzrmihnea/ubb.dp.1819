package lab1.SOLID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoffeeInterpreterServiceImpl implements CoffeInterpreterService{

    @Override
    public List<Ingredient> interpretCoffee(List<String> coffeeData) {
        List<Ingredient> coffeeIngredientsList = new ArrayList<>();

        coffeeData.forEach(line -> {
            try {
                String[] splittedLine = splitLine(line);
                validateLine(splittedLine);
                coffeeIngredientsList.add(getIngredientsListFromLine(splittedLine));
            }
            catch (CoffeeInterpreterException e) {
                e.printStackTrace();
            }
        });

        return coffeeIngredientsList;
    }

    private String[] splitLine(String lineString) {
        return lineString.trim().split(" ");
    }

    private void validateLine(String[] splittedLine) throws CoffeeInterpreterException{
        if (splittedLine.length < 3 || splittedLine.length > 4)
            throw new CoffeeInterpreterException(String.format("Line %s has an invalid length", Arrays.asList(splittedLine).toString()));
    }

    private Ingredient getIngredientsListFromLine(String[] line) {
        double qty = Double.parseDouble(line[0]);
        String unit = line[1];
        String ingredient = line[2];
        String adjective = line.length == 4 ? line[3] : null;

        return new Ingredient(qty, unit, ingredient, adjective);
    }
}
