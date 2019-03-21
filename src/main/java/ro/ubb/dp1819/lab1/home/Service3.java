package ro.ubb.dp1819.lab1.home;

import ro.ubb.dp1819.lab1.home.factory.CoffeeType;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Service3 {

    private String filename;
    private CoffeeType coffeeType = new CoffeeType();

    public Service3(String filename) {
        this.filename = filename;
    }

    public List<CoffeeType> run() {
        List<CoffeeType> types = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.filename));
            String line = bufferedReader.readLine();
            while (line != null) {
                createSpecific(types, line);

                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return types;
    }

    private void createSpecific(List<CoffeeType> types, String line) throws IOException {
        String[] ingred = line.split("\\+");

        List<CoffeeIngredient> ingredients = new ArrayList<>();

        for (int i = 0; i < ingred.length; i++) {
            String[] lineArr = ingred[i].split(" ");
            CoffeeIngredient coffeeIngredient;
            if (lineArr.length == 3) {
                coffeeIngredient = new CoffeeIngredient.Builder()
                        .setQuantity(Integer.parseInt(lineArr[0]))
                        .setUnit(lineArr[1])
                        .setIngredient(lineArr[2])
                        .buid();
            } else {
                if (lineArr.length == 4) {
                    coffeeIngredient = new CoffeeIngredient.Builder()
                            .setQuantity(Integer.parseInt(lineArr[0]))
                            .setUnit(lineArr[1])
                            .setIngredient(lineArr[2])
                            .setAdjective(lineArr[3])
                            .buid();
                } else {
                    throw new IOException("wrong number of words");
                }
            }
            System.out.println(coffeeIngredient);
            ingredients.add(coffeeIngredient);
        }
        if (ingred.length == 2) {
            types.add(coffeeType.createCoffee(ingredients.get(0), ingredients.get(1)));
        }
        if (ingred.length == 3) {
            types.add(coffeeType.createCoffee(ingredients.get(0), ingredients.get(1), ingredients.get(2)));
        }
    }
}
