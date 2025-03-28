package part4.ObjectsInLists;

public class TelevisionProgram
{
    private String programName;
    private int duration;

    public TelevisionProgram(String programName, int duration) {
        this.programName = programName;
        this.duration = duration;
    }

    public int getDuration() {
         return this.duration;
    }

    @Override
    public String toString() {
        return this.programName + ", " + this.duration;
    }
}
