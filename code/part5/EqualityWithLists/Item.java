package code.part5.EqualityWithLists;

import java.util.ArrayList;

public class Item
{
    private String name;
    private String identifier;

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
        if (!(compare instanceof Item)){
            return false;
        }
        Item itemCompared = (Item) compare;
        return this.identifier.equals(itemCompared.getIdentifier());
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
