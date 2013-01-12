import java.util.ArrayList;

public class Interests {
	
	ArrayList<String> aList;
	boolean used;
	
	Interests()
	{
		aList = new ArrayList<String>();
	}
	Interests(Interests theInterests)
	{
		aList = theInterests.aList;
		used = theInterests.used;
	}
	public void add(String interest)
	{
		aList.add(interest);
	}
	public ArrayList<String> getInterests()
	{
		return aList;
	}
	public void setUsed()
	{
		used = true;
	}
	

}
