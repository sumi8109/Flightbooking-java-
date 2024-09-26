package BookinManager;

import java.util.ArrayList;

public class FlightManager {

    private ArrayList<Flight> flights;

    public FlightManager() {
        flights = new ArrayList<>();
    }

    public void addFlight(String flightNumber, String destination, String departure, int seatsAvailable) {
        Flight flight = new Flight(flightNumber, destination, departure, seatsAvailable);
        flights.add(flight);
    }

    public Flight getFlightByNumber(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        return null;
    }

    public void displayAvailableFlights() {
        if (flights.isEmpty()) {
            System.out.println("No flights available.");
        } else {
            for (Flight flight : flights) {
                System.out.println(flight);
            }
        }
    }
}
