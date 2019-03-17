package ro.ubb.dp1819.lab1.macarie_cristian.cluj.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UtilService {
    private static UtilService utilService;

    private UtilService() {
    }

    public static UtilService getInstance() {
        if (utilService == null) {
            utilService = new UtilService();
        }
        return utilService;
    }

    public List<String> readFileLineByLine(String filename) {
        List<String> rows = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(filename))) {
            rows = stream.map(String::trim).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rows;
    }
}
