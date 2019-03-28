package ro.ubb.dp1819.lab2.exercises.adapter;

import ro.ubb.dp1819.lab1.exercises.Encapsulation_1_1.ReadFileServiceImpl;
import java.io.IOException;
import java.util.List;

public class ReadFileAdapter extends ReadFileServiceImpl {
    private ReadCarParts adaptee;

    public ReadFileAdapter() {
        super();
        this.adaptee = new ReadCarParts();
    }

    @Override
    public void readFile(String fileName) throws IOException {
        this.adaptee.read(fileName);
    }

    @Override
    public List<String> getLines() {
        return this.adaptee.getComponents();
    }
}
