package intro_pt2.Streams.LiteracyComparison;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LiteracyDataProcessor
{
    List<LiteracyData> unescoData;

    public LiteracyDataProcessor() {
        this.unescoData = new ArrayList<>();
    }


    public void loadDataFromStream(InputStream inputStream)
    {
        try (InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] parts = line.split(",");
                unescoData.add(new LiteracyData(
                        parts[3].trim(), Integer.parseInt(parts[4].trim()),
                        parts[2].trim(), Double.parseDouble(parts[5].trim()))
                );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printData() {
        unescoData.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(unescoData);
    }

    public void sortBy(Comparator<LiteracyData> comparator) {
        unescoData.sort(comparator);
    }
}
