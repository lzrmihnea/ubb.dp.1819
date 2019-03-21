package services;

import java.io.FileNotFoundException;
import java.util.List;

public interface IOService {
	List<String> readFile(String fileName) throws FileNotFoundException;
}
