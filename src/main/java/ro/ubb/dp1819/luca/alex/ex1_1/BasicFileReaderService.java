package ro.ubb.dp1819.luca.alex.ex1_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BasicFileReaderService implements FileReaderService {

    @Override
    public List<String> readFromFile(String filename) throws CoffeeException, IOException {
        List<String> lines = new ArrayList<>();

        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            lines.add(st);
        }


        return lines;
    }
}
