
public class BodyHeader {

	String header;
	boolean used = false;
	public BodyHeader()
	{
		header = "#808080";
	}
	public BodyHeader(String color)
	{
		header = "<body bgcolor = " + color + ">";
		used = true;
	}
	public BodyHeader(BodyHeader theHead)
	{
		header = theHead.header;
		used = theHead.used;
	}
	public void setHead(String theHead)
	{
		header = theHead;
	}
	public String toString()
	{
		return header;
	}
	public void setUsed()
	{
		used = true;
	}
}
