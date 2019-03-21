package ro.ubb.dp1819.fulea.razvan.lab1.encapsulation;

import java.util.ArrayList;
import java.util.List;

class ParseService {

    static List<CoffeeIngredient> parseCoffeeList(List<String> coffeeList){
        List<CoffeeIngredient> result = new ArrayList<>();
        for (String line: coffeeList){
            String[] tokens = line.split(",");
            if (tokens.length == 3 || tokens.length == 4) {
                Integer quantity = 0;
                try{
                    quantity = Integer.parseInt(tokens[0]);
                }
                catch (NumberFormatException e){
                    throw new RuntimeException("Invalid coffeeIngredient format for line: " + line + ";\tQuantity should be integer!");
                }
                String unit = tokens[1];
                String ingredient = tokens[2];
                CoffeeIngredient coffeeIngredient = new CoffeeIngredient(quantity, unit, ingredient);
                if (tokens.length == 4) {
                    String adjective = tokens[3];
                    coffeeIngredient.setAdjective(adjective);
                }
                result.add(coffeeIngredient);
            }
            else {
                throw new RuntimeException("Invalid coffee format for line: " + line);
            }
        }
        return result;
    }

}
