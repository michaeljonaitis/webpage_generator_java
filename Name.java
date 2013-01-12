
public class Name {
	
	String first;
	String last;
	boolean used = false;
	
	public Name()
	{
		
	}
	public Name(String theFirst, String theLast)
	{
		first = theFirst;
		last = theLast;
		used = true;
	}
	public Name(Name name)
	{
		first = name.first;
		last = name.last;
		used = name.used;
	}
	
	public void setFirst(String firstName)
	{
		first = firstName;
	}
	public void setLast(String lastName)
	{
		last = lastName;
	}
	public String toString()
	{
		return first + " " + last;
	}
	public void setUsed()
	{
		used = true;
	}


}
