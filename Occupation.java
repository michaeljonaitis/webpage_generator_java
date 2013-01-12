
public class Occupation {
	String occupation;
	boolean used = false;
	
	public Occupation()
	{
		
	}
	public Occupation(String theOccupation)
	{
		occupation = theOccupation;
		used = true;
	}
	public Occupation(Occupation theOccupation)
	{
		occupation = theOccupation.occupation;
		used = theOccupation.used;
	}
	public void setOccupation(String theOccu)
	{
		occupation = theOccu;
	}
	public String toString()
	{
		return occupation;
	}
	public void setUsed()
	{
		used = true;
	}
}
