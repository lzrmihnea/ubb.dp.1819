package ro.ubb.dp1819.lab1.macarie_cristian.cluj.service;

import ro.ubb.dp1819.lab1.macarie_cristian.cluj.domain.Ingredient;

import java.util.List;
import java.util.stream.Collectors;

public class CoffeeService { 
    private static final String FILE_NAME = "ro/ubb/dp1819/lab1/macarie_cristian/input.txt";
    private UtilService utilService = UtilService.getInstance();

    public List<Ingredient> getIngredients() {
        List<String> rows = utilService.readFileLineByLine(FILE_NAME);
        return rows.stream()
                .map(row -> row.split(" "))
                .filter(this::validateRow)
                .map(row -> {
                    Ingredient.IngredientBuilder builder = Ingredient.builder()
                            .quantity(Double.parseDouble(row[0]))
                            .unit(row[1])
                            .name(row[2]);
                    if (row.length > 3) {
                        builder.adjective(row[3]);
                    }
                    return builder.build();
                })
                .collect(Collectors.toList());
    }

    private boolean validateRow(String[] row) {
        return row.length > 2 && row.length < 5;
    }
}
