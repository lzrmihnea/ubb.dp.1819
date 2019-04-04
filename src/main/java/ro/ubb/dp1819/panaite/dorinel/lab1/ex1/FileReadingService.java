package ro.ubb.dp1819.panaite.dorinel.lab1.ex1;

import java.io.File;
import java.util.List;

public interface FileReadingService {
    List<String> readAllLines(String filePath) throws FileReadingException;
    List<String> readAllLines(File file) throws FileReadingException;
}
