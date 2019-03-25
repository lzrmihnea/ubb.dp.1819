package csorba.norberth.lab2.adapter;

import java.io.IOException;
import java.util.List;

public interface IReaderService {
    List<String> read(String uri) throws IOException;
}
