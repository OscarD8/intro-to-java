package part4;

public class Film
{
    String name;
    int ageRating;

    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }

    public String getName(){
        return this.name;
    }

    public int getAgeRating() {
        return this.ageRating;
    }
}
