package ro.ubb.dp1819.panaite.dorinel.ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReadingServiceImpl implements FileReadingService {
    @Override
    public List<String> readAllLines(String filePath) throws FileReadingException {
        // Create file from path
        File file = new File(filePath);

        // Read all the lines
        return readAllLines(file);
    }

    @Override
    public List<String> readAllLines(File file) throws FileReadingException {
        // Pre-check if the files meets the requirements for reading from it
        preCheckFile(file);

        // Create the buffered reader
        BufferedReader bufferedReader = createReader(file);

        // Read the lines from buffer
        List<String> lines = readAllLinesFromReader(bufferedReader);

        // Dispose the reader
        disposeReader(bufferedReader);

        // Provide the lines
        return lines;
    }

    //<editor-fold desc="Private methods">
    /**
     * Various file checks.
     * @param file - the file object to be checked
     * @throws FileReadingException if anything wrong with the file
     */
    private void preCheckFile(File file) throws FileReadingException {
        // Check if file exists
        if (!file.exists())
            throw new FileReadingException(String.format("File %s does not exist", file.getName()));

        // Check if file can be read
        if (!file.canRead())
            throw new FileReadingException(String.format("File %s was unable to be read", file.getName()));
    }

    /**
     * Openes the file and provides a buffered reader.
     * @param file - the file to be opened
     * @return a buffered reader
     * @throws FileReadingException if file failed to be opened
     */
    private BufferedReader createReader(File file) throws FileReadingException {
        try {
            // Try to create the buffered reader
            return new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new FileReadingException(String.format("File %s does not exist", file.getName()));
        }
    }

    /**
     * Closes the reader.
     * @param reader - the reader to be disposed
     * @throws FileReadingException if disposing goes wrong
     */
    private void disposeReader(BufferedReader reader) throws FileReadingException {
        try {
            reader.close();
        } catch (IOException e) {
            throw new FileReadingException(String.format("Closing the buffered reader resulted in: %s", e.getMessage()));
        }
    }

    /**
     * Reads all lines from the buffered reader
     * @param bufferedReader the reader to fetch the lines from
     * @return a list of all the lines
     */
    private List<String> readAllLinesFromReader(BufferedReader bufferedReader) {
        List<String> lines = new ArrayList<>();

        String readLine;
        while ((readLine = readLineFromReader(bufferedReader)) != null) {
            lines.add(readLine);
        }

        return lines;
    }

    /**
     * Read a single line from the buffered reader
     * @param bufferedReader the reader to fetch the line from
     * @return a line stirng
     */
    private String readLineFromReader(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            return null;
        }
    }
    //</editor-fold>
}
