package lab2.Adapter;

import java.util.List;

public class CarPartsReadingService {
    private Adapter adapter;

    public CarPartsReadingService(Adapter adapter) {
        this.adapter = adapter;
    }

    public List<String> readCarPartsFromFile(String fileName) {
        return adapter.readFileAsStringList(fileName);
    }
}
