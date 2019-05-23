package Pb1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {
    private String filename;

    public FileReaderService(String filename) {
        this.filename = filename;
    }

    public List<String> readFromFile() throws IOException {
        File file = new File(filename);
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            list.add(st.trim());

        return list;
    }
}
