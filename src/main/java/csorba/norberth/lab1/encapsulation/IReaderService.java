package csorba.norberth.lab1.encapsulation;

import java.io.IOException;
import java.util.List;

public interface IReaderService {
    List<String> read(String uri) throws IOException;
}
