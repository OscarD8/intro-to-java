package intro_pt2.HashMap.VehicleRegistry;

import java.util.Objects;

public class LicensePlate
{
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LicensePlate that = (LicensePlate) o;
        return that.liNumber.equals(liNumber) && that.country.equals(country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liNumber, country);
    }
}
