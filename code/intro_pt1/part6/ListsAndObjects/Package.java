package intro_pt1.part6.ListsAndObjects;

import java.util.ArrayList;

public class Package
{
    private final ArrayList<Gift> parcel;
    private int parcelWeight;

    public Package() {
        this.parcel = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.parcel.add(gift);
        this.parcelWeight += gift.getWeight();
    }
    public void removeGift(String name) {
        for (Gift item : this.parcel) {
            if (item.getName().equals(name)) {
                parcel.remove(item);
            }
        }
    }

    public int totalWeight() {
        return this.parcelWeight;
    }

}
