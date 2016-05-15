public class Flight
{
  private String dateAndTime;
  private int nrOfTickets;
  private String departure;
  private String arrival;
  private String flightID;
  private float price;
 // Vector<FlightTicket> tickets
  
  public Flight()
  {
    
  }
  
  public boolean match(String date, String departure, String arrival)
  {
    return false;
  }
  
  public boolean reserveTickets(String flightID, int nrOfTickets, String email, String ticketID)
  {
    return false;
  }
  
  public void setDateAndTime(String dateAndTime)
  {
    this.dateAndTime = dateAndTime;
  }
    
  public void setNrOfTickets(int nrOfTickets)
  {
    this.nrOfTickets = nrOfTickets;
  }
  
  public void setDeparture(String departure)
  {
    this.departure = departure;
  }
  
  public void setArrival(String arrival)
  {
    this.arrival = arrival;
  }
  
  public void setFlightID(String flightID)
  {
     this.flightID = flightID;
  }
  
  public void setPrice(float price)
  {
    this.price = price;          
  }
  
  public final String getDateAndTime()
  {
    return dateAndTime;
  }
  
  public final int getNrOfTickets()
  {
    return nrOfTickets;
  }

  public final String getDeparture()
  {
    return departure;
  }
  
  public final String getArrival()
  {
    return arrival;
  }
  
  public final String getFlightID()
  {
    return flightID;
  }
  
  public final float getPrice()
  {
    return price;
  }

}