public class Email {
	
	String email;
	boolean used = false;
	
	public Email()
	{
		
	}
	public Email(String theEmail)
	{
		email = theEmail;
		used = true;
	}
	public Email(Email theEmail)
	{
		email = theEmail.email;
		used = theEmail.used;
	}
	public void setEmail(String theEmail)
	{
		email = theEmail;
	}
	public String toString()
	{
		return email;
	}
	public void setUsed()
	{
		used = true;
	}
}
