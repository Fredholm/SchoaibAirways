public abstract class Account
{
  private String password;
  private String email;
  private String name;
  
  public Account(String password, String email, String name)
  {
    this.password = password;
    this.email = email;
    this.name = name;
  }
  
  public void setPassword(String password)
  {
    this.password = password;
  }
  
  public void setEmail(String email)
  {
    this.email = email;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getPassword()
  {
    return password;
  }
  
  public String getEmail()
  {
    return email;
  }
  
  public String getName()
  {
    return name;
  }
}