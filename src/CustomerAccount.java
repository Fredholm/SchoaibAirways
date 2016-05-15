import java.util.Vector;

public class CustomerAccount extends Account
{
  private Vector<FlightTicket> tickets;
  
  public CustomerAccount(String password, String email, String name)
  {
    super(password, email, name);
    tickets = new Vector<FlightTicket>;
  }
  
  public bool addTicket(FlightTicket ticket)
  {
    return true;
  }
  
  public Vector<FlightTicket> viewTickets()
  {
    return tickets;
  }
  
  public void selectTicket(int index[])
  {
    
  }
    
  public void returnTickets(FlightTicket tickets)
  {
    
  }
}