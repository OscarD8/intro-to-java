package intro_pt1.part5.EqualityWithLists;

public class Bird
{
    private final String name;

    public Bird(String name) {
        this.name = name;
    }

    public boolean equals(Object compare) {
        // if the references are the same then they must be pointing to the same object on the heap
        if (this == compare) {
            return true;
        }
        // if compared object returns false when questioned if instance of Bird type Object (if not true) then must be false
        if (!(compare instanceof Bird birdCompare)) {
            return false;
        }
        // setting compare to specific type of Bird object to access instance variables
        // Now that compare has access to encapsulation of Bird class, we can compare instance variables
        return this.name.equals(birdCompare.name);
        // return this.name.equals(birdCompare.name);
    }
}
