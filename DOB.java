
public class DOB {
	String dob;
	boolean used = false;
	
	public DOB()
	{
		
	}
	public DOB(DOB date)
	{
		dob = date.dob;
		
		used = date.used;
	}
	
	public void setDate(String theDate)
	{
		dob = theDate;
	}

	public String toString()
	{
		return dob;
	}
	public void setUsed()
	{
		used = true;
	}
	

}
