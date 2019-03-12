package csorba.norberth.lab1.encapsulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService implements IReaderService {
    @Override
    public List<String> read(String filePath) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null){
                lines.add(line);
            }
            return lines;
        }catch (IOException ex){
            throw ex;
        }
    }
}
