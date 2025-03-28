package part7.largerPrograms.RecipeSearch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class FileHandler
{
    public final int ENDOFFILE = -1;

    public FileHandler() throws IOException
    {
        File file = new File(Paths.get("recipes.txt").toAbsolutePath().toString());
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while ((line = bufferedReader.readLine()) != null)
        {
            stringBuffer.append(line);
            stringBuffer.append("\n");
            System.out.println("***"+line+"***");
        }
        System.out.println("The whole thing: " +stringBuffer);
    }
}
