package intro_pt1.part7.Algorithms.InformationRetrieval;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Book> bookbois = new ArrayList<>();
        bookbois.add(new Book("Dracula", 1));
        bookbois.add(new Book("Harry Petter", 2));
        bookbois.add(new Book("We all like Shaun", 3));
        bookbois.add(new Book("We all like Shaun2", 4));
        bookbois.add(new Book("We all like Shaun3", 5));
        bookbois.add(new Book("We all like Shaun4", 6));
        bookbois.add(new Book("We all like Shaun5", 7));
        bookbois.add(new Book("We all like Shaun6", 8));
        bookbois.add(new Book("We all like Shaun7", 9));

        System.out.println(linearSearch(bookbois, 5));
        System.out.println(binarySearch(bookbois, 1));
        System.out.println();
        for (Book book : bookbois) {
            System.out.println(binarySearch(bookbois, book.getId()));
        }
    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int basePointer = 0;
        int endPointer = books.size();
        int index;

        while (!(basePointer > endPointer)) {
            index = (basePointer + endPointer) / 2;

            if (books.get(index).getId() == searchedId) {
                return index;
            }
            if (searchedId > books.get(index).getId()) {
                basePointer = index + 1;
            }
            if (searchedId < books.get(index).getId()) {
                endPointer = index - 1;
            }
        }

        return - 1;
    }
}
