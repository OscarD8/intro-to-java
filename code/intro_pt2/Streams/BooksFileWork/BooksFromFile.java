package intro_pt2.Streams.BooksFileWork;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BooksFromFile
{
    public static void main(String[] args) {
        List<Book> books = readBooks("code/intro_pt2.Streams/BooksFileWork/book_datafile");
        books.stream().forEach(System.out::println);
    }


    public static List<Book> readBooks(String file) {
        try {
            return Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .filter(parts -> parts.length >= 4)
                    .map(parts -> new Book(parts[3], parts[0], Integer.parseInt(parts[2])))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error:" + e);
            return new ArrayList<>();
        }
    }
}
