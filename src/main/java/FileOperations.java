import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {

    public String[] linesToArray(String filename) {

        int linesCount = countLines(filename);
        String[] arrayOfLines = new String[linesCount];

        try (
                var filereader = new FileReader(filename);
                var reader = new BufferedReader(filereader)
        ) {
            for (int i = 0; i < linesCount; i++) {
                arrayOfLines[i] = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return arrayOfLines;
    }

    public int countLines(String filename) {
        int linesCount = 0;
        try (
                var filereader = new FileReader(filename);
                var reader = new BufferedReader(filereader)
        ) {
            while ((reader.readLine()) != null) {
                linesCount++;
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return linesCount;
    }

}
