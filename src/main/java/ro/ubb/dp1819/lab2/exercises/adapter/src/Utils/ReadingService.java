package Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingService {
    private List<String> lines;
    private String filename;

    public ReadingService(String filename) {
        this.filename = filename;
        this.lines = new ArrayList<>();
    }

    public List<String> readIngredients(){
        try {
            BufferedReader bf = new BufferedReader(new FileReader(filename));
            String line;
            while((line = bf.readLine())!=null)
                lines.add(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
