package intro_pt2.Streams.CargoHold;

import java.util.ArrayList;

public class Hold
{
    private int maxWeight;
    private int holdWeight;
    private ArrayList<Suitcase> inHold;

    public Hold(int weight) {
        this.maxWeight = weight;
        this.inHold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        boolean weightCheck = checkWeight(suitcase);
        if (weightCheck) {
            this.inHold.add(suitcase);
            holdWeight += suitcase.getTotalWeight();
        }
        else {
            System.out.println("Capacity at maximum. " + suitcase + " not added.");
        }
    }

    public boolean checkWeight(Suitcase suitcase) {
        return (holdWeight += suitcase.getTotalWeight()) < maxWeight;
    }

    public void printItems() {
        inHold.stream()
                .forEach(Suitcase::printItems);
    }

    @Override
    public String toString() {
        return inHold.size() + " suitcases. " + " (" + holdWeight + "kg)";
    }
}
