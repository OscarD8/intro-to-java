package intro_pt2.Dictionary;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;


public class SaveableDictionary
{
    private Map<String, String> dictionary;
    private String filename;

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.filename = file;
    }


    public boolean load() {
        // The class loader that loaded the class
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(filename);

        // the stream holding the file content
        if (inputStream != null) {
            readFile(inputStream);
            return true;
        }
        return false;
    }

    private void readFile(InputStream inputStream)
    {
        try (InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader))
        {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                dictionary.putIfAbsent(parts[0], parts[1]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean save() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("resources/dictionary.txt"))) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue());
                writer.newLine();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void add(String word, String translation){
        if (canAdd(word, translation)) {
            dictionary.put(word, translation);
            return;
        }
        System.out.println("Translations already in dictionary.");
    };

    public boolean canAdd(String word1, String word2) {
        return dictionary.entrySet()
                .stream()
                .noneMatch(entry ->
                        entry.getKey().equals(word1) || entry.getValue().equals(word1) ||
                        entry.getKey().equals(word2) || entry.getValue().equals(word2));
    }

    public String translate(String word) {
        return dictionary.entrySet()
                .stream()
                .filter(entry -> word.equals(entry.getKey()) || word.equals(entry.getValue()))
                .findFirst()
                .map(entry -> word.equals(entry.getKey()) ? entry.getValue() : entry.getKey())
                .orElse(null);
    }

    public void delete(String word) {
            dictionary.remove(word);
            dictionary.entrySet().removeIf(entry -> word.equals(entry.getValue()));
    }
    
}
