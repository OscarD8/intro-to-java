package part7.Algorithms.InformationRetrieval;

public class Book
{
    private int id;
    private String name;

    public Book(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
