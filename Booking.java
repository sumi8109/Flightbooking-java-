package Booking;

import BookinManager.Flight;

public class Booking {
    private String passengerName;
    private Flight flight;

    public Booking(String passengerName, Flight flight) {
        this.passengerName = passengerName;
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "Passenger Name='" + passengerName + '\'' +
                ", Flight=" + flight +
                '}';
    }
}
