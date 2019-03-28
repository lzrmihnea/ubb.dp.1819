package ro.ubb.dp1819.lab1.exercises.Encapsulation_1_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileServiceImpl {
    private List<String> lines;

    public ReadFileServiceImpl(){
        lines = new ArrayList<>();
    }

    public void readFile(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String str;
        while ((str = bufferedReader.readLine()) != null){
            lines.add(str.trim());
        }
    }

    public List<String> getLines() {
        return lines;
    }
}
