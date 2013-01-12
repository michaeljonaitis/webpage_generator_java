import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;

public class Interpreter {

	Social mySocial = new Social();
	List<List<String>> list;
	String string;
	BufferedWriter writer;
	
	Education education = new Education();
	Address address = new Address();
	Name name = new Name();
	Occupation occupation = new Occupation();
	Email email = new Email();
	Interests interests = new Interests();
	ProfilePic profilePic = new ProfilePic();
	DOB dateOfBirth = new DOB();
	BodyHeader bodyColor = new BodyHeader();
	
	Interpreter(List<List<String>> theList, BufferedWriter out)
	{
		list = theList;
		writer = out;
	}
	void printIt()
	{
		int k = 0;
		List<String> alist;
		
		while(k < list.size())
		{
			alist = list.get(k);
			
			int i = 0;
		
			while(i < alist.size())
			{
				string = alist.get(i);
				i++;
			}
			
			k++;
		}
	}
	void Interperate()
	{
		int k = 0;
		
		List<String> alist;
		
		while(k < list.size())
		{
			alist = list.get(k);
			int i = 0;
			string = alist.get(i);
			
			if(string.compareTo("SET") == 0)
			{
				string = alist.get(i = i + 1);
				
				if(string.compareTo("NAME") == 0)
				{
					string = alist.get(i = i + 1);
					name.setFirst(string);
					string = alist.get(i = i + 1);
					name.setLast(string);
					name.setUsed();
					mySocial.setName(name);
				}
				else if(string.compareTo("EMAIL") == 0)
				{
					string = alist.get(i = i + 1);
					email.setEmail(string);
                   	email.setUsed();
					mySocial.setEmail(email);
				}
				else if(string.compareTo("OCCUPATION") == 0)
				{
					string = alist.get(i = i + 1);
					occupation.setOccupation(string);
                    occupation.setUsed();
					mySocial.setOccupation(occupation);
				}
				else if(string.compareTo("INTERESTS") == 0)
				{
					string = alist.get(i = i + 1);
					interests.add(string);
					
					if(i + 1 < alist.size() )
					{
						string = alist.get(i = i + 1);
						
						if(string.compareTo(",") == 0)
						{
							while(i + 2 < alist.size() && alist.get(i + 2).compareTo(",") == 0)
								{
									string = alist.get(i = i + 1);
									interests.add(string);
									i = i + 1;
								}
							
							string = alist.get(i + 1);
							interests.add(string);	
						}
						else
						{
							System.out.println("COMPILE ERROR - INVALID INTERESTS STATEMENT");
						}
					}

                    interests.setUsed();
					mySocial.setInterests(interests);
				}
				else if(string.compareTo("ADDRESS") == 0)
				{
					string = alist.get(i = i + 1);
					address.setNumber(string);
					string = alist.get(i = i + 1);
					address.setStreet(string);
					string = alist.get(i = i + 1);
					address.setCity(string);
					string = alist.get(i = i + 1);
					address.setState(string);
					address.setUsed();
			
					mySocial.setAddress(address);
				}
				else if(string.compareTo("EDUCATION") == 0)
				{
						string = alist.get(i = i + 1);
					
						if(string.compareTo("HIGHSCHOOL") == 0)
						{
							string = alist.get(i = i + 1);
							education.setHigh(string);
							string = alist.get(i = i + 1);
							education.setHighGrad(string);
							education.setUsed();
							
							mySocial.setEducation(education);
						}
						else if(string.compareTo("COLLEGE") == 0)
						{
							string = alist.get(i = i + 1);
							education.setCollege(string);
							string = alist.get(i = i + 1);
							education.setCollegeGrad(string);
							education.setUsed();
							
							mySocial.setEducation(education);
						}
						else
						{
							System.out.println("COMPILE ERROR - EDUCATION SUBSET INVALID");
						}	
				}
				else if(string.compareTo("PIC") == 0)
				{
					string = alist.get(i = i + 1);
					profilePic.setPath(string);
					profilePic.setUsed();
					mySocial.setProfilePic(profilePic);
				}
				else if(string.compareTo("DOB") == 0)
				{
					string = alist.get(i = i + 1);
					dateOfBirth.setDate(string);
					dateOfBirth.setUsed();
					mySocial.setDOB(dateOfBirth);
				}
				else if(string.compareTo("COLOR") == 0)
				{
					string = alist.get(i = i + 1);
					bodyColor.setHead(string);
					bodyColor.setUsed();
					mySocial.setHead(bodyColor);
				}
				else
				{
					System.out.println("COMPILE ERROR - INVALID STATEMENT");
				}
			}
			k++;
		}
	
		try 
		{
			mySocial.build(writer);
			
		} catch (IOException e) {
					e.printStackTrace();
				}
	}	
}
