public class FlightTicket
{
  
  private String ticketID;
  private String seatPosition;
  private Account userID;

  public FlightTicket()
  {
    
  }
  
  public boolean reserveTicket (String userID)
  {
    return false;
  }
  
  public void setTicketID(String ticketID)
  {
    this.ticketID = ticketID;
  }
  
  public void setSeatPosition(String seatPosition)
  {
    this.seatPosition = seatPosition;
  }
  
  public void setUserID(userID)
  {
    this.userID = userID;
  }
  
  public final String getTicketID()
  { 
    return ticketID;
  }
  
  public final String getSeatPosition()
  {
    return seatPosition;
  }
  
  public final Account getUserID()
  {
    return userID;
  }
  
  public boolean returnTicket()
  {
   return false; 
  }
}