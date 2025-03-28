package part4;

public class Song
{
    private String name;
    private int length;

    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName(){
        return this.name;
    }

    public int getLength(){
        return this.length;
    }

    public String toString(){
        return "The song " + this.name + " has a length of " + this.length + " seconds.";
    }
}
