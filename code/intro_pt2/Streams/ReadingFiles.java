package intro_pt2.Streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadingFiles
{
    public static void main(String[] args) {
        List<String> readFile = read("code/intro_pt2.Streams/datafile.txt");
        System.out.println(readFile);
    }

    public static List<String> read(String file) {
        List<String> fileAsList = new ArrayList<>();

        try {
            Files.lines(Paths.get(file)).forEach(fileAsList::add);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return fileAsList;
    }
}
