package ro.ubb.dp1819.lab1.exercises.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringService {
    public List<String> readFromFile(String filename) {
        File file = new File(filename);
        Scanner sc;
        List<String> elements = new ArrayList<>();
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine())
                elements.add(sc.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return elements;
    }
}
