public class Address {

	String street;
	String number;
	String city;
	String state;
	boolean used = false;
	
	Address(String theStreet, String theNumber, String theCity, String theState)
	{
		setStreet(theStreet);
		setNumber(theNumber);
		setCity(theCity);
		setState(theState);
	}
	public Address() 
	{
		
	}
	public Address(Address theAddress) 
	{
		street = theAddress.street;
		number = theAddress.number;
		city = theAddress.city;
		state = theAddress.state;
		used = theAddress.used;
	}
	void setStreet(String theStreet)
	{
		street = theStreet;
	}
	void setNumber(String theNumber)
	{
		number = theNumber;
	}
	void setCity(String theCity)
	{
		city = theCity;
	}
	void setState(String theState)
	{
		state = theState;
	}
	void setUsed()
	{
		used = true;
	}
	public String toString()
	{
		return number + " " + street + ", " + city + ", " + state;
	}
}
