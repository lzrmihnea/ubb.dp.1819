package ro.ubb.dp1819.luca.alex.ex1_1;

import java.io.IOException;
import java.util.List;

public interface FileReaderService {
    List<String> readFromFile(String filename) throws IOException, CoffeeException;
}
