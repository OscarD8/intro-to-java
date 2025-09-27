package intro_pt2.FlightControl.logic;

import intro_pt2.FlightControl.domain.Airplane;
import intro_pt2.FlightControl.domain.Flight;
import intro_pt2.FlightControl.domain.Place;

import java.util.Collection;
import java.util.HashMap;

public class FlightControl
{
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Place> places;
    private HashMap<String, Flight> flights;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.places    = new HashMap<>();
        this.flights   = new HashMap<>();
    }


    public boolean addAirplane(String ID, int capacity) {
        if (airplanes.containsKey(ID)) {
            return false;
        }
        airplanes.put(ID, new Airplane(ID, capacity));
        return true;
    }

    public void addFlight(Airplane airplane, String origin, String destination) {
        places.putIfAbsent(origin, new Place(origin));
        places.putIfAbsent(destination, new Place(destination));

        Flight flight = new Flight(airplane, places.get(origin), places.get(destination));
        flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAirplanes() {
        return airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return flights.values();
    }

    public Place getPlace(String ID) {
        return this.places.getOrDefault(ID, null);
    }

    public Airplane getAirplane(String ID) {
        return this.airplanes.getOrDefault(ID, null);
    }
}
