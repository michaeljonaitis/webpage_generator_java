import java.io.*;

public class Social {
	
	Name name;
	Address address;
	Education education;
	Occupation occupation;
	Email email;
	Interests interests;
	ProfilePic profilepic;
	DOB dateOfBirth;
	BodyHeader bodyColor;
	
	public Social()
	{
		name = new Name("Your", "Name");
		address = new Address();
		education = new Education();
		occupation = new Occupation();
		email = new Email();
		interests = new Interests();
		profilepic = new ProfilePic();
		dateOfBirth = new DOB();
		bodyColor = new BodyHeader();
	}
	
	public void makeHeader(BufferedWriter out) throws IOException
	{
		out.write("<html>");
		out.newLine();
		out.write("<header>");
		out.newLine();
		out.write("</header>");
		out.newLine();	
	}
	public void makeFooter(BufferedWriter out) throws IOException
	{
		out.write("</body>");
		out.newLine();
		out.write("</html>");
	}
	public void closeFile(BufferedWriter out) throws IOException
	{
		out.close();
	}
	public void setName(Name theName)
	{
		name = new Name(theName);
	}
	public void setAddress(Address theAddress)
	{
		address = new Address(theAddress);
	}
	public void setEducation(Education theEducation)
	{
		education = new Education(theEducation);
	}
	public void setProfilePic(ProfilePic thePath)
	{
		profilepic = new ProfilePic(thePath);
	}
	public void setDOB(DOB theDate)
	{
		dateOfBirth = new DOB(theDate);
	}
	public void setOccupation(Occupation theOccupation)
	{
		occupation = new Occupation(theOccupation);
	}
	public void setHead(BodyHeader theColor)
	{
		bodyColor = new BodyHeader(theColor);
	}
	public void setEmail(Email theEmail)
	{
		email = new Email(theEmail);
	}
	public void setInterests(Interests theInterests)
	{
		interests = new Interests(theInterests);
	}
	public void BuildInterests(BufferedWriter out) throws IOException
	{
		out.write("<P ALIGN=LEFT><h3>Interests</h3>");
		out.write("<ul>");
		out.newLine();
		
		for(int i = 0; i < interests.aList.size(); i++)
		{
			out.write("<li>");
			out.write(interests.aList.get(i));
			out.write("</li>");
			out.newLine();
		}
		
		out.write("</ul></center></P>");
		out.newLine();
	}
	public void BuildColor(BufferedWriter out) throws IOException
	{
		out.write("<body bgcolor = ");
		out.write(bodyColor.toString());
		out.write(">");
		out.newLine();
	}
	public void BuildProfilePic(BufferedWriter out) throws IOException
	{
		out.write("<h2>");
		out.newLine();
		out.write("<img style=\"border:6px ridge #545565;\" src=\""+ profilepic.toString()+ "\" width=\"150\" height=\"150\" />");
		out.newLine();
		out.write("</h2>");
		out.newLine();
	}
	public void BuildDob(BufferedWriter out) throws IOException
	{
		out.write("<h4>");
		out.newLine();
		out.write("DOB: " + dateOfBirth.toString());
		out.newLine();
		out.write("</h4>");
		out.newLine();
	}
	public void BuildName(BufferedWriter out) throws IOException
	{
		out.write("<h2>");
		out.newLine();
		out.write(name.toString());
		out.newLine();
		out.write("</h2>");
		out.newLine();
	}
	public void BuildAddress(BufferedWriter out) throws IOException
	{
		out.write("<h4>");
		out.newLine();
		out.write(address.toString());
		out.newLine();
		out.write("</h4>");
		out.newLine();
	}
	public void BuildEducation(BufferedWriter out) throws IOException
	{
		out.write("<p align=left><h3>");
		out.newLine();
		out.write("Education</h3>");
		out.write("<ul>");
		out.newLine();
		out.write("<li>");
		out.write(education.highToString());
		out.write("</li>");
		out.newLine();
		out.write("<br>");
		out.newLine();
		out.write("<li>");
		out.write(education.collegeToString());
		out.write("</li>");
		out.newLine();
		out.write("</ul>");
		out.write("</p>");
		out.newLine();
	}
	public void BuildOccupation(BufferedWriter out) throws IOException
	{
		out.write("<b><font size = 3>");
		out.newLine();
		out.write("Occupation: </b></font>");
		out.write(occupation.toString());
		out.newLine();
	}
	public void BuildEmail(BufferedWriter out) throws IOException
	{
		out.write("<h4>");
		out.newLine();
		out.write(email.toString());
		out.write("</h4>");
		out.newLine();
	}
	public void addRule(BufferedWriter out) throws IOException
	{
		out.write("<hr>");
		out.newLine();
	}
	public void build(BufferedWriter out) throws IOException
	{
		
		makeHeader(out);
	
		out.write("<table cellpadding=20>");
		out.newLine();
		out.write("<tr>");
		out.newLine();
		out.write("<td>");
		
		if(name.used)
		{
			BuildColor(out);
		}
		if(name.used)
		{
			BuildName(out);
		}
		if(dateOfBirth.used)
		{
			BuildDob(out);
		}
		
		addRule(out);
		
		if(profilepic.used)
		{
			BuildProfilePic(out);
		}
		
		out.write("<u>Contact Information</u>");
		
		if(email.used)
		{
			BuildEmail(out);
		}
		if(address.used)
		{
			BuildAddress(out);	
		}
		
		out.write("</td>");
		out.write("<td>");
		
		if(occupation.used)
		{
			BuildOccupation(out);
		}
		if(education.used)
		{
			BuildEducation(out);
		}
		if(interests.used)
		{
			BuildInterests(out);
		}
		
		out.write("</td>");
		out.newLine();
		out.write("</tr>");
		out.newLine();
		out.write("</table>");	
		makeFooter(out);
	}
}
