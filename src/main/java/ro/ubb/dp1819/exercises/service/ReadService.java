package ro.ubb.dp1819.exercises.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadService {

    public static List<String> readFile(String filePath) {
        final List<String> lines = new ArrayList<>();

        try {
            final BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();

            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }

            reader.close();
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }

        return lines;
    }

}
