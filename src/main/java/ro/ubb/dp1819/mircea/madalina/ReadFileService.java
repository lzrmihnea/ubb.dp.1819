package ro.ubb.dp1819.mircea.madalina;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Madalina Mircea on 3/12/2019.
 */
public class ReadFileService {
    public List<String> readFile(String filename)
    {
        String line = "";
        List<String> result = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            line = bufferedReader.readLine();
            while(line  != null) {
                result.add(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Could not open file '" + filename + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + filename + "'");
        }

        return result;
    }
}