package ro.ubb.dp1819.lab1.home;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Service1 {

    private String filename;

    public Service1(String filename) {
        this.filename = filename;
    }

    public List<String> run() {
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.filename));
            String line = bufferedReader.readLine();
            while (line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
