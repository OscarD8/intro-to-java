package code.part5.PrimitivesAndReferenceTypes;

public class AmusementRide
{
    private String name;
    private int minHeight;

    public AmusementRide (String name, int minHeight) {
        this.name = name;
        this.minHeight = minHeight;
    }

    public boolean heightCheck(int height) {
        return this.minHeight <= height;
    }
}
