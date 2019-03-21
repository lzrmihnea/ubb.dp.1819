package ro.ubb.dp1819.lab1.exercises.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class FileReaderService {
    public static List<String> getLines(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            return br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("file not found");
        }
    }
}
