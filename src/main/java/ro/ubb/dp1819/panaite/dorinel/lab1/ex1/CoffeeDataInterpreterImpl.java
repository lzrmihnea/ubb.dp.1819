package ro.ubb.dp1819.panaite.dorinel.lab1.ex1;

import ro.ubb.dp1819.panaite.dorinel.lab1.ex2.CompoundCoffeeIngredients;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoffeeDataInterpreterImpl implements CoffeeDataInterpreter {
    private FileReadingService fileReadingService;

    public CoffeeDataInterpreterImpl(FileReadingService fileReadingService) {
        this.fileReadingService = fileReadingService;
    }

    @Override
    public List<BaseCoffeeIngredients> getCoffee(String filePath) throws CoffeeDataInterpreterException {
        try {
            // Read files from file
            List<String> coffeeLines = fileReadingService.readAllLines(filePath);

            // Interpret data
            return interpretData(coffeeLines);
        } catch (FileReadingException e) {
            throw new CoffeeDataInterpreterException(String.format("Exception occured while interpreting coffee data: %s", e.getMessage()));
        }
    }

    /**
     * Interpret the data from the list of lines.
     * @param coffeeLines the lines read from file
     * @return coffee ingredients from the generated lines
     * @throws CoffeeDataInterpreterException if any error occurs while processing ingredients from line
     */
    private List<BaseCoffeeIngredients> interpretData(List<String> coffeeLines) throws CoffeeDataInterpreterException {
        List<BaseCoffeeIngredients> coffeeIngredients = new ArrayList<>();
        List<String> errorList = new ArrayList<>();

        coffeeLines.forEach(line -> {
            try {
                coffeeIngredients.add(getIngredientsFromLine(line));
            } catch (CoffeeDataInterpreterException e) {
                errorList.add(String.format("Error occured while getting ingredients from line: %s", e.getMessage()));
            }
        });

        // Check error list
        checkErrorList(errorList);

        // Provide the coffee ingredients
        return coffeeIngredients;
    }

    /**
     * Validate if a line corresponds to the requirements.
     * @param splitLine the line to be checked
     * @throws CoffeeDataInterpreterException if the line isn't ok
     */
    private void validateSplitLine(String[] splitLine) throws CoffeeDataInterpreterException {
        // Check line length
        if (splitLine.length < 3 || splitLine.length > 4)
            throw new CoffeeDataInterpreterException(String.format("Line %s has an invalid length", Arrays.asList(splitLine).toString()));
    }

    /**
     * Get the ingredients from the line.
     * @param line the line to get ingredients from
     * @return an instance of coffee ingredients
     * @throws CoffeeDataInterpreterException if line cannot be parsed
     */
    @Override
    public BaseCoffeeIngredients getIngredientsFromLine(String line) throws CoffeeDataInterpreterException {
        if (line.contains("+")) {
            return createCompoundFromLine(line);
        } else {
            return createIngredientFromLine(splitAndValidateLine(line));
        }
    }

    private String[] splitAndValidateLine(String line) throws CoffeeDataInterpreterException {
        line = line.trim();

        // Split the ingredient line
        String[] splitLine = line.split(" ");

        // Validate the line
        validateSplitLine(splitLine);

        return splitLine;
    }

    private BaseCoffeeIngredients createIngredientFromLine(String[] splitLine) {
        // Create ingredients
        double qty = Double.parseDouble(splitLine[0]);
        String unit = splitLine[1];
        String ingredient = splitLine[2];
        String adjective = splitLine.length == 4 ? splitLine[3] : null;

        // Construct coffee ingredients
        return new CoffeeIngredients(qty, unit, ingredient, adjective);
    }

    private CompoundCoffeeIngredients createCompoundFromLine(String compoundLine) throws CoffeeDataInterpreterException {
        String[] lines = compoundLine.split("\\+");

        CompoundCoffeeIngredients compoundCoffeeIngredients = new CompoundCoffeeIngredients(createIngredientFromLine(splitAndValidateLine(lines[0])));
        for (int i = 1; i < lines.length; i++) {
            compoundCoffeeIngredients.addSecondIngredient(createIngredientFromLine(splitAndValidateLine(lines[i])));
        }
        return compoundCoffeeIngredients;
    }

    /**
     * Checks if there is any error in error list and builds an error message.
     * @param errorList the list to be checked
     * @throws CoffeeDataInterpreterException if any error occurred.
     */
    private void checkErrorList(List<String> errorList) throws CoffeeDataInterpreterException {
        if (errorList.size() != 0) {
            StringBuilder stringBuilder = new StringBuilder();

            errorList.forEach(error -> stringBuilder.append(error).append("\n"));

            throw new CoffeeDataInterpreterException(String.format("Errors occured:\n%s", stringBuilder.toString()));
        }
    }
}
