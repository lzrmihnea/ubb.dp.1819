package encapsulation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {
    public List<String> ingredients = new ArrayList<>();

    public FileReaderService(String path) {
        readFile(path);
    }

    public void readFile(String path) {
        try {
            FileInputStream fstream = new FileInputStream(path);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("iRead "+ line);
                ingredients.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
