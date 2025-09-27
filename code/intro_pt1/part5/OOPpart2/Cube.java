package intro_pt1.part5.OOPpart2;

public class Cube
{
    private final int edgeLength;

    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
    }

    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    }

    public String toString() {
        return "The length of the edge is " + edgeLength +
                " and the volume " + volume();
    }
}
