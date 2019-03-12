package ro.ubb.dp1819.todoran.corina.lab1.encapsulation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileService {
    public List<String> readFile(File filename) {
        List<String> lines = new ArrayList<>();
        String line;

        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            line = bufferedReader.readLine();
            while (line != null){
                lines.add(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file '" + filename + "'");
        } catch (IOException e) {
            System.out.println("Error reading file '" + filename + "'");
        }
        return lines;
    }
}
