package ro.ubb.dp1819.lab1.denis_vieriu_lab1.service;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceCoffeFileReader {
    private String fileName;

    public ServiceCoffeFileReader(String _fileName) {
        this.fileName = _fileName;
    }

    public List<String> readFileIngredientsAsStrings() {
        List<String> lineIngredients = new ArrayList<String>();
        FileInputStream fstream = null;

        try {
            fstream = new FileInputStream(this.fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String ingrLine;

            // Read Line by Line
            while((ingrLine = br.readLine()) !=  null)
            {
                lineIngredients.add(ingrLine);
            }

            fstream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lineIngredients;
    }
}
