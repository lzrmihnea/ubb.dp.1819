package lab2.Adapter;

import lab1.SOLID.FileReadingService;

import java.util.List;

public class Adapter {
    private FileReadingService fileReadingService;

    public Adapter(FileReadingService fileReadingService) {
        this.fileReadingService = fileReadingService;
    }

    public List<String> readFileAsStringList(String fileName) {
        return fileReadingService.readFileAsStringList(fileName);
    }
}
