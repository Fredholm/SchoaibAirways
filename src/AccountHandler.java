import java.util.Vector;

public class AccountHandler
{
  private Vector<Account> accounts;

  public AccountHandler()
  {
    accounts = new Vector<Account>(50); // ?
  }
  public boolean addAccount(String name, String email, String password)
  {
    
  return false;
  }

  public boolean login(String email, String password)
  {
    return false;  
  }
  
  public boolean removeAccount(String email)
  {
    return false;
  }
  
  public Account findAccount(String email)
  {
	return null;
  
  }
  
}