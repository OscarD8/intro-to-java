package intro_pt2.Interfaces.Packing;

import java.util.Objects;

public class Book implements Packable
{
    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    public double weight() {
        return weight;
    }


    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book that = (Book) o;
        return that.name.equals(name) && that.author.equals(author) && that.weight == weight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, weight);
    }

    @Override
    public String toString() {
        return author + ": " + name;
    }
}
