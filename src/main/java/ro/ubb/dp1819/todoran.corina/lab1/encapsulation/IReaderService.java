package ro.ubb.dp1819.todoran.corina.lab1.encapsulation;

import java.io.File;
import java.util.List;

public interface IReaderService {
    List<String> readFile(File filename);
}
