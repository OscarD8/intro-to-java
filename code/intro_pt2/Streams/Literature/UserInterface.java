package intro_pt2.Streams.Literature;

import java.util.Comparator;
import java.util.Scanner;

public class UserInterface
{
    Scanner scanner;
    BookCollection bookCollection;

    public UserInterface(Scanner scanner, BookCollection bookCollection) {
        this.scanner = scanner;
        this.bookCollection = bookCollection;
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();

            if (bookName.isEmpty()) {
                break;
            }

            System.out.print("Input the recommended age: ");
            int ageRec = Integer.parseInt(scanner.nextLine());
            bookCollection.add(new Book(bookName, ageRec));
        }

        System.out.println();
        System.out.println(bookCollection.getCount() + " books in total.");
        bookCollection.sortBy(Comparator.comparing(Book::getAgeRec).thenComparing(Book::getName));
        bookCollection.printBooks();
    }
}
