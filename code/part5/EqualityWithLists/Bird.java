package code.part5.EqualityWithLists;

public class Bird
{
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public boolean equals(Object compare) {
        // if the references are the same then they must be pointing to the same object on the heap
        if (this == compare) {
            return true;
        }
        // if compared object returns false when questioned if instance of Bird type Object (if not true) then must be false
        if (!(compare instanceof  Bird)) {
            return false;
        }
        // setting compare to specific type of Bird object to access instance variables
        Bird birdCompare = (Bird) compare;
        // Now that compare has access to encapsulation of Bird class, we can compare instance variables
        if (
                this.name.equals(birdCompare.name)
        ) return true;
        // return this.name.equals(birdCompare.name);

        return false;
    }
}
