package intro_pt2.HashMap.VehicleRegistry;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry
{
    HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.vehicleRegistry.containsKey(licensePlate)) {
            this.vehicleRegistry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (this.vehicleRegistry.containsKey(licensePlate)) {
            return vehicleRegistry.get(licensePlate);
        }
        return "No entry found for that license plate.";
    }

    public boolean remove(LicensePlate licensePlate) {
        if (vehicleRegistry.containsKey(licensePlate)) {
            vehicleRegistry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate entry : vehicleRegistry.keySet()) {
            System.out.println(entry);
        }
    }

    public void printOwners() {
        ArrayList <String> printedOwners = new ArrayList<>();

        for (String entry : vehicleRegistry.values()) {
            if (!printedOwners.contains(entry)) {
                System.out.println(entry);
                printedOwners.add(entry);
            }
        }
    }
}
