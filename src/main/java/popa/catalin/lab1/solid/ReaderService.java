package popa.catalin.lab1.solid;

import popa.catalin.lab1.CoffeeException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReaderService {
    public static List<String> readAllLines(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            throw new CoffeeException(e.getMessage());
        }
    }
}
