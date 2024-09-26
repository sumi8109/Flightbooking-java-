package BookinManager;

import java.util.ArrayList;
import Booking.Booking;

public class BookingManager {

    private ArrayList<Booking> bookings;

    public BookingManager() {
        bookings = new ArrayList<>();
    }

    public void addBooking(String passengerName, Flight flight) {
        Booking booking = new Booking(passengerName, flight);
        bookings.add(booking);
        flight.bookSeat();
        System.out.println("Booking confirmed for " + passengerName);
    }

    public void displayAllBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings made.");
        } else {
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }
}
