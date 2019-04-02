package SOLID;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class CoffeeReadingService implements FileReadingService {
    public List<String> readFileAsStringList(String fileName)
    {
        List<String> lines = Collections.emptyList();
        try
        {
            isValidFile(Paths.get(fileName).toFile());
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }
        catch (FileReadingException fe) {
            fe.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return lines;
    }

    private void isValidFile(File file) throws FileReadingException {
        if (!file.exists())
            throw new FileReadingException(String.format("File %s does not exist", file.getName()));
        if (!file.canRead())
            throw new FileReadingException(String.format("File %s was unable to be read", file.getName()));
    }

}
