package intro_pt1.part4.ObjectsInLists;

public class TelevisionProgram
{
    private final String programName;
    private final int duration;

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
