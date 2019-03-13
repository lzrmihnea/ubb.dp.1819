package ro.ubb.dp1819.panaite.dorinel.ex1;

import java.util.ArrayList;
import java.util.List;

public class CoffeeDataInterpreterImpl implements CoffeeDataInterpreter {
    private FileReadingService fileReadingService;

    public CoffeeDataInterpreterImpl(FileReadingService fileReadingService) {
        this.fileReadingService = fileReadingService;
    }

    @Override
    public List<CoffeeIngredients> getCoffee(String filePath) throws CoffeeDataInterpreterException {
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
    private List<CoffeeIngredients> interpretData(List<String> coffeeLines) throws CoffeeDataInterpreterException {
        List<CoffeeIngredients> coffeeIngredients = new ArrayList<>();
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
            throw new CoffeeDataInterpreterException("Line %s has an invalid length");
    }

    /**
     * Get the ingredients from the line.
     * @param line the line to get ingredients from
     * @return an instance of coffee ingredients
     * @throws CoffeeDataInterpreterException if line cannot be parsed
     */
    private CoffeeIngredients getIngredientsFromLine(String line) throws CoffeeDataInterpreterException {
        // Split the ingredient line
        String[] splitLine = line.split(" ");

        // Validate the line
        validateSplitLine(splitLine);

        // Create ingredients
        double qty = Double.parseDouble(splitLine[0]);
        String unit = splitLine[1];
        String ingredient = splitLine[2];
        String adjective = splitLine.length == 4 ? splitLine[3] : null;

        // Construct coffee ingredients
        return new CoffeeIngredients(qty, unit, ingredient, adjective);
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
