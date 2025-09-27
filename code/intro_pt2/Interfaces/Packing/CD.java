package intro_pt2.Interfaces.Packing;

public class CD implements Packable
{
    String artist;
    String name;
    int publicationYear;
    double weight;

    public CD(String artist, String name, int publicationYear) {
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
        this.weight = weight();
    }


    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return name + ": " + artist + " (" + publicationYear + ")";
    }
}
