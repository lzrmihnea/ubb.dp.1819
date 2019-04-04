package ro.ubb.dp1819.panaite.dorinel.lab2.ex1;

import java.util.List;

public interface CarPartReaderService {
    List<String> readCarParts(String filename) throws CarPartReaderException;
}
