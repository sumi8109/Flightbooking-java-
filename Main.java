package Main;

import java.util.Scanner;
import BookinManager.BookingManager;
import BookinManager.Flight;
import BookinManager.FlightManager;

public class Main  {
    public static void main(String[] args) {
        FlightManager flightManager = new FlightManager();
        BookingManager bookingManager = new BookingManager();
        Scanner scanner = new Scanner(System.in);

        // Adding some initial flights
        flightManager.addFlight("F001", "New York", "09:00 AM", 10);
        flightManager.addFlight("F002", "London", "11:30 AM", 5);
        flightManager.addFlight("F003", "Paris", "03:45 PM", 2);

        while (true) {
            System.out.println("\n--- Flight Booking System ---");
            System.out.println("1. Display Available Flights");
            System.out.println("2. Book a Flight");
            System.out.println("3. View All Bookings");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    flightManager.displayAvailableFlights();
                    break;
                case 2:
                    System.out.print("Enter passenger name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter flight number to book: ");
                    String flightNumber = scanner.nextLine();
                    Flight flight = flightManager.getFlightByNumber(flightNumber);

                    if (flight != null) {
                        if (flight.getSeatsAvailable() > 0) {
                            bookingManager.addBooking(name, flight);
                        } else {
                            System.out.println("No seats available on this flight.");
                        }
                    } else {
                        System.out.println("Flight not found.");
                    }
                    break;
                case 3:
                    bookingManager.displayAllBookings();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
