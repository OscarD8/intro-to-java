package part6.ListsAndObjects;

public class Message
{
    private String message;

    public void feckoff() {
        this.message = "Could you kindly feck off.";
    }

    public void meSoSad() {
        this.message = "Me so sad.";
    }

    public void donuts() {
        this.message = "Just love donuts.";
    }

    public String getMessage() {
        return this.message;
    }

    public int length() {
        return this.message.length();
    }

}
