package intro_pt1.part5.PrimitivesAndReferenceTypes;

public class AmusementRide
{
    private final String name;
    private final int minHeight;

    public AmusementRide (String name, int minHeight) {
        this.name = name;
        this.minHeight = minHeight;
    }

    public boolean heightCheck(int height) {
        return this.minHeight <= height;
    }
}
