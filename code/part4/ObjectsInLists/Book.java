package part4.ObjectsInLists;

import java.time.Year;

public class Book
{
    private final String bookName;
    private final int pagesNum;
    private final Year publicationYear;

    public Book(String bookName, int pagesNum, String publicationYear){
        this.bookName = bookName;
        this.pagesNum = pagesNum;
        this.publicationYear = Year.parse(publicationYear);
    }

    public void getBookName() {
        System.out.println(this.bookName);
    }

    public void getNoOfPages() {
        System.out.println((this.pagesNum) + " pages.");
    }

    public void getPublicationYear() {
        System.out.println(this.publicationYear);
    }

    @Override
    public String toString() {
        return this.bookName + ", " + this.pagesNum + " pages, " + this.publicationYear;
    }
}
