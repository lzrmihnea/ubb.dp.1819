package ro.ubb.dp1819.panaite.dorinel.lab2.ex1;

import ro.ubb.dp1819.panaite.dorinel.lab1.ex1.FileReadingException;
import ro.ubb.dp1819.panaite.dorinel.lab1.ex1.FileReadingService;

import java.util.List;

public class CarPartReaderServiceImpl implements CarPartReaderService {
    private FileReadingService fileReadingService;

    public CarPartReaderServiceImpl(FileReadingService fileReadingService) {
        this.fileReadingService = fileReadingService;
    }

    @Override
    public List<String> readCarParts(String filename) throws CarPartReaderException {
        try {
            return fileReadingService.readAllLines(filename);
        } catch (FileReadingException e) {
            throw new CarPartReaderException(e.getMessage());
        }
    }
}
