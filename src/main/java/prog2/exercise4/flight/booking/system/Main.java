package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
import java.util.Scanner;

import prog2.exercise4.flight.booking.system.FlightBooking.DestinationAirport;
import prog2.exercise4.flight.booking.system.FlightBooking.SourceAirport;
/**
 * Hello world!
 *
 */
public class Main 
{
    private static final String getFlightCompany = null;
    private static final LocalDate returnDate = null;
    public static void main( String[] args )
    {
        FlightBooking fb = new FlightBooking("null", returnDate, null, 2, 3);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your fullname:");
        String passengerFullName = input.next();


        Scanner input1 = new Scanner(System.in);
        System.out.println("Please choose BookingClass from 1.First 2.business 3.Economy:");
        int bookingClass = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please choose tripType from 1.One way 2.Return:");
        int tripType = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Please choose tripsource from 1.NANJING 2.BEIJING 3.OULU 4.HELSINKI:");
        int tripSource = input3.nextInt();

        Scanner input4 = new Scanner(System.in);
        System.out.println("Please choose tripdestination from 1.NANJING 2.BEIJING 3.OULU 4.HELSINKI:");
        int tripDestination = input4.nextInt();

        Scanner input5 = new Scanner(System.in);
        System.out.println("Please enter your departingdate:");
        String departing = input5.next();
        LocalDate departure = LocalDate.parse(departing);

        Scanner input6 = new Scanner(System.in);
        System.out.println("Please enter your returningdate:");
        String returning = input5.next();
        LocalDate returningDate = LocalDate.parse(returning);
        
        
        String company = fb.getFlightCompany();

        String ticketNumber = fb.getTicketNumber();
        SourceAirport source = fb.getSourceAirport();
        DestinationAirport destination = fb.getDestinationAiport();
        
        int TotalPassengers = fb.getTotalPassengers();
        fb.setTotalPassengers(2,3);
        int totalPassengers = fb.getTotalPassengers();
        
        double TotalTicketPrice = fb.getTotalTicketPrice();

        fb.toString();
        

        System.out.println( "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        company + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + source + " to " + destination + "\n" +
        "Date of departure: " + departure + "\n" +
        "Date of return: " + returningDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + TotalTicketPrice);
        
        
        input.close();
        input1.close();
        input2.close();
        input3.close();
        input4.close();
        input5.close();
        input6.close();
    }
}
        
        
    
