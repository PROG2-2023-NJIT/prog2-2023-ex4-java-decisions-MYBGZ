package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;

import javax.sql.rowset.CachedRowSet;
import javax.xml.transform.Source;


public class FlightBooking {

    

    private static final String company = null;
    private static final String source = null;
    private static final String destination = null;
    private static final String departure = null;
    private static final String returningDate = null;
    String flightCompany =  "Flights_of_Fancy";
    private String passengerFullName;
    static LocalDate departureDate;
    static LocalDate returnDate;
    private int childrenPassengers;
    private int adultPassengers;
    int totalPassengers;
    private double departingTicketPrice;
    private double returnTicketPrice;
    private double totalTicketPrice;
    private String ticketNumber;
    
    private BookingClass bookingClass;
    enum BookingClass {
        FIRST, BUSINESS, ECONOMY
    }
    public void setBookingClass(String i)
    {
        if (i == "1")
        {
            bookingClass = BookingClass.FIRST;
        }
        if (i == "2")
        {
            bookingClass = BookingClass.BUSINESS;
        }
        if (i == "3")
        {
            bookingClass = BookingClass.ECONOMY;
        }
    }
    public BookingClass getBookingClass() {
        return bookingClass;
    }

    
    private TripType tripType;
    enum TripType{
        ONE_WAY, RETURN;
    }
    public void setTripType(String j){
        if(j=="1"){
            tripType = TripType.ONE_WAY;
        }
        if(j=="2"){
            tripType = TripType.RETURN;
        }
    }

    private SourceAirport sourceAirport;
    private TripSource tripSource;
    enum TripSource{
        NANJING, BEIJING, OULU, HELSINKI;
    }
    enum SourceAirport{
        NANJING_LUKOU_International_Airport, Beijing_Capital_International_Airport, Oulu_Airport, Helsinki_Airport;
    }
    public void setTripSource(String i){
        if(i=="1"){
            tripSource = TripSource.NANJING;
            sourceAirport = SourceAirport.NANJING_LUKOU_International_Airport;
        }
        if(i== "2"){
            tripSource = TripSource.BEIJING;
            sourceAirport = SourceAirport.Beijing_Capital_International_Airport;
        }
        if(i=="4"){
            tripSource = TripSource.OULU;
            sourceAirport = SourceAirport.Oulu_Airport;
        }
        if(i=="5"){
            tripSource = TripSource.HELSINKI;
            sourceAirport = SourceAirport.Helsinki_Airport;
        }
    }
    public TripSource getTripSource(){
        return tripSource;
    }
    public SourceAirport getSourceAirport() {
        return sourceAirport;
    }




    private DestinationAirport destinationAiport;
    private TripDestination tripDestination;
    enum TripDestination{
        NANJING, BEIJING, OULU, HELSINKI;
    }
    enum DestinationAirport{
        NANJING_LUKOU_International_Airport, Beijing_Capital_International_Airport, Oulu_Airport, Helsinki_Airport;
    }
    public void setTripDestination(String i, String j){
        if(i=="1"){
            tripDestination = TripDestination.NANJING;
            destinationAiport = DestinationAirport.NANJING_LUKOU_International_Airport;
        }
        if(i== "2"){
            tripDestination = TripDestination.BEIJING;
            destinationAiport = DestinationAirport.Beijing_Capital_International_Airport;
        }
        
        if(i=="3"){
            tripDestination = TripDestination.OULU;
            destinationAiport = DestinationAirport.Oulu_Airport;
        }
        if(i=="4"){
            tripDestination = TripDestination.HELSINKI;
            destinationAiport = DestinationAirport.Helsinki_Airport;
        }
        
    }
    public TripDestination getTripDestination(){
        return tripDestination;
    }
    public DestinationAirport getDestinationAiport() {
        return destinationAiport;
    }

    public FlightBooking(String PassengerFullName,LocalDate DepartingDate,LocalDate ReturningDate,int ChildrenPassengers,int AdultPassengers) {
        passengerFullName = PassengerFullName;
        departureDate = DepartingDate;
        returnDate = ReturningDate;
        this.childrenPassengers = ChildrenPassengers;
        this.adultPassengers = AdultPassengers;
    }
    
    
    public String getFlightCompany() {
        return flightCompany;
    }
    public String getPassengerFullName(){
        return passengerFullName;
    }
    public void setPassengerFullName(String passengerFullName){
        this.passengerFullName = passengerFullName;
    }
    
    public LocalDate getDepartureDate() {
        return departureDate;
    }
    public void setDepartureDate(LocalDate departureDate){
        FlightBooking.departureDate = departureDate;
    }

    public LocalDate getReturnDate(){
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate){
        int result = returnDate.compareTo(departureDate);
        if(result>=2){
            FlightBooking.returnDate = returnDate; 
        }
        if(result == 1){
            returnDate = returnDate.plusDays(1);
            FlightBooking.returnDate = returnDate;
        }
        if(result==0){
            returnDate = returnDate.plusDays(2);
            FlightBooking.returnDate = returnDate;
        }
    }

    public int getChildrenPassengers() {
        return childrenPassengers;
    }
    public void setChildrenPassengers(int childrenPassengers) {
        this.childrenPassengers = childrenPassengers;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }
    public void setAdultPassengers(int adultPassengers) {
        this.adultPassengers = adultPassengers;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }
    public void setTotalPassengers(int childrenPassengers,int adultPassengers) {
        this.totalPassengers = childrenPassengers + adultPassengers;
    }
    
    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }
    public void setDepartingTicketPrice(int i, int j) {

    }
    

    public double getReturnTicketPrice() {
        return returnTicketPrice;
    }
    public void setReturnTicketPrice() {

    }
  
    

    public String getTicketNumber() {
        return "11FASDFDOM";
    }
    public void setTicketNumber(String TicketNumber){
        String a = "0";
        String b  = "0";
        String c ="0";
        if(tripType==TripType.ONE_WAY){
            a = "11";
        }
        if(tripType==TripType.RETURN){
            a = "22";
        }
        if(bookingClass==BookingClass.FIRST){
            b = "F";
        }
        if(bookingClass==BookingClass.BUSINESS){
            b = "B";
        }
        if(bookingClass==BookingClass.ECONOMY){
            b = "E";
        }
        if((tripSource==TripSource.NANJING&&tripDestination==TripDestination.BEIJING) ||(tripSource==TripSource.BEIJING&&tripDestination==TripDestination.NANJING) ||(tripSource==TripSource.OULU&&tripDestination==TripDestination.HELSINKI) ||(tripSource==TripSource.HELSINKI&&tripDestination==TripDestination.OULU)){
            c = "DOM";
        }
        else{
            c = "INT";
        }
        this.ticketNumber = a + b + "0000" +c;
    
    }

    public String toString() {
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " + 
        flightCompany + ". Following are the details of your booking and the trip:" + "\n" + 
        "Ticket Number: " + ticketNumber + "\n" + 
        "From " + tripSource + " to " + tripDestination + "\n" +
        "Date of departure: " + departureDate + "\n" +
        "Date of return: " + returnDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" +
        "Total ticket price in Euros: " + totalTicketPrice;

    }

    public void setTotalTicketPrice() {
        this.totalTicketPrice = Math.abs((((2 *((300 + (0.1*300)) + (0.05*300))) + (5*((300 + (0.1*300)) + (0.05*300)))) + 250)*2);
    }
    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }

    

  
        


        
    }

