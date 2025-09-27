package intro_pt1.part5.EqualityWithLists;

public class Item
{
    private String name;
    private final String identifier;

    public Item(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }
    public Item(String identifier) {
        this.identifier = identifier;
    }
    public String getName(){
        return this.name;
    }
    public String getIdentifier() {
        return this.identifier;
    }
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        if (!(compare instanceof Item itemCompared)){
            return false;
        }
        return this.identifier.equals(itemCompared.getIdentifier());
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
