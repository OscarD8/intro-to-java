package intro_pt1.part5.OOPpart2;

public class Book
{
    private final String author;
    private final String title;
    private final int pageCount;

    public Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public String toString(){
        return this.author + ", " + this.title + ", " + this.pageCount;
    }
}
