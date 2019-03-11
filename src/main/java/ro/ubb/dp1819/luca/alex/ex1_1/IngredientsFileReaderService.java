package ro.ubb.dp1819.luca.alex.ex1_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IngredientsFileReaderService implements FileReaderService {

    @Override
    public List<String> readFromFile(String filename) throws IOException, CoffeeException {
        List<String> lines = new ArrayList<>();
        File file = new File(filename);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null) {
            String[] ingredients = line.split(",");
            if (ingredients.length < 3 || ingredients.length > 4) {
                throw new CoffeeException("Not a valid number of ingredients");
            }
            lines.add(line);
        }

        return lines;
    }
}
