package BookinManager;

public class Flight  {
    private String flightNumber;
    private String destination;
    private String departure;
    private int seatsAvailable;

    public Flight(String flightNumber, String destination, String departure, int seatsAvailable) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.seatsAvailable = seatsAvailable;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void bookSeat() {
        if (seatsAvailable > 0) {
            seatsAvailable--;
        } else {
            System.out.println("No seats available on this flight.");
        }
    }

    @Override
    public String toString() {
        return "Flight{" +
                "Flight Number='" + flightNumber + '\'' +
                ", Destination='" + destination + '\'' +
                ", Departure='" + departure + '\'' +
                ", Seats Available=" + seatsAvailable +
                '}';
    }
}
