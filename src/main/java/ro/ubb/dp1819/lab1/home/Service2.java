package ro.ubb.dp1819.lab1.home;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Service2 {

    private String filename;

    public Service2(String filename) {
        this.filename = filename;
    }

    public List<CoffeeIngredient> run() {
        List<CoffeeIngredient> ingredients = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.filename));
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] lineArr = line.split(" ");
                if (lineArr.length == 3){
                    CoffeeIngredient coffeeIngredient = new CoffeeIngredient(Integer.parseInt(lineArr[0]),
                            lineArr[1],lineArr[2]);
                    ingredients.add(coffeeIngredient);
                } else {
                    if (lineArr.length == 4){
                        CoffeeIngredient coffeeIngredient = new CoffeeIngredient(Integer.parseInt(lineArr[0]),
                                lineArr[1],lineArr[2],lineArr[3]);
                        ingredients.add(coffeeIngredient);
                    } else {
                        throw new IOException("wrong number of words");
                    }
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingredients;
    }
}
