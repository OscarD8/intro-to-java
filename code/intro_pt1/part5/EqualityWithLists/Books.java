package intro_pt1.part5.EqualityWithLists;

public class Books
{
    private final String name;
    private final int publicationYear;

    public Books(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        if (!(compare instanceof Books booksCompare)) {
            return false;
        }
        return booksCompare.publicationYear == this.publicationYear &&
                booksCompare.name.equals(this.name);
    }
    public String getName() {
        return this.name;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }

    public String toString(){
        return this.getName() + ", " + this.getPublicationYear();
    }
}
