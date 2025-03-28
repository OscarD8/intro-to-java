package part7.largerPrograms.RecipeSearch;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

import static part7.largerPrograms.RecipeSearch.FileResourcesUtils.printFile;
import static part7.largerPrograms.RecipeSearch.FileResourcesUtils.printInputStream;

public class Main
{
    public static void main(String[] args) throws IOException, URISyntaxException {

        FileResourcesUtils app = new FileResourcesUtils();

        //String fileName = "database.properties";
        String fileName = "recipes.txt";

        System.out.println("getResourceAsStream : " + fileName);
        InputStream is = app.getFileFromResourceAsStream(fileName);
        printInputStream(is);

        System.out.println("\ngetResource : " + fileName);
        File file = app.getFileFromResource(fileName);
        printFile(file);

    }
}
