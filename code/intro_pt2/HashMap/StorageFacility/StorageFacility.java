package intro_pt2.HashMap.StorageFacility;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility
{
    private HashMap<String, ArrayList<String>> storageUnits;

    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }


    public void add(String unit, String item) {
        storageUnits.putIfAbsent(unit, new ArrayList<>());

        storageUnits.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return storageUnits.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        storageUnits.get(storageUnit).remove(item);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> filledUnits = new ArrayList();

        for (String unit : this.storageUnits.keySet()) {
            if (!storageUnits.get(unit).isEmpty()) {
                filledUnits.add(unit);
            }
        }
        return filledUnits;
    }
}
