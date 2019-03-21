package ro.ubb.dp1819.fulea.razvan.lab1.encapsulation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class ReadService {

    static List<String> read(String filename) throws IOException {
        List<String> lines = new ArrayList<>();
        File file = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null)
            lines.add(line);
        return lines;
    }

}
