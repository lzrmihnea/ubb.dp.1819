package ro.ubb.dp1819.grigor.sebastian.lab1.services;

import ro.ubb.dp1819.grigor.sebastian.lab1.drinks.Ingredient;

public class IngredientParserImpl implements IngredientParser {

    @Override
    public Ingredient parse(String string) {
        String[] strings = string.trim().split("[\\s,]");
        switch (strings.length) {
            case 3:
                return new Ingredient(strings[0], strings[1], strings[2]);
            case 4:
                return new Ingredient(strings[0], strings[1], strings[2], strings[3]);
            default:
                throw new IllegalArgumentException("Too many words in string. " +
                        "Allowed number of words for an ingredient: 3 or 4");
        }
    }
}
