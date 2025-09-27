package intro_pt2.Streams.Literature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class BookCollection
{
    private List<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public int getCount() {
        return books.size();
    }

    public void printBooks() {
        System.out.println("Books: ");
        books.forEach(System.out::println);
    }

    public void sortBy(Comparator<Book> comparator) {
        books.sort(comparator);
    }
}
