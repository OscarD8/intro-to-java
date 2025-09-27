package intro_pt2.Streams.LiteracyComparison;

import java.io.InputStream;
import java.util.Comparator;


public class Main
{
    public static void main(String[] args) {
        FileResourcesUtils fileReader = new FileResourcesUtils();
        LiteracyDataProcessor unescoData = new LiteracyDataProcessor();
        InputStream inputStream = fileReader.getFileFromResourceAsStream("literacy.csv");
        unescoData.loadDataFromStream(inputStream);

        unescoData.printData();
        System.out.println();
        unescoData.sort();
        unescoData.printData();
        System.out.println();
        unescoData.sortBy(Comparator.comparing(LiteracyData::getCountry).reversed());
        unescoData.printData();
    }
}
