
public class Education {

	String highSchool;
	String highGrad;
	String college;
	String collegeGrad;
	boolean used = false;
	
	public Education()
	{
		
	}
	public Education(Education theEducation)
	{
		highSchool = theEducation.highSchool;
		highGrad = theEducation.highGrad;
		college = theEducation.college;
		collegeGrad = theEducation.collegeGrad;
		used = theEducation.used;
		
	}
	public void setHigh(String theHighSchool)
	{
		highSchool = theHighSchool;
	}
	public void setHighGrad(String theHighGrad)
	{
		highGrad = theHighGrad;
	}
	public void setCollege(String theCollege)
	{
		college = theCollege;
	}
	public void setCollegeGrad(String theCollegeGrad)
	{
		collegeGrad = theCollegeGrad;
	}
	public void setUsed()
	{
		used = true;
	}
	public String highToString()
	{
		return highSchool + ", " + highGrad;
	}
	public String collegeToString()
	{
		return college + ", " + collegeGrad;
	}
	
	
	
	
}
