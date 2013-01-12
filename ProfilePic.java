public class ProfilePic {
	
	String filePath;
	boolean used = false;
	
	public ProfilePic()
	{
		
	}
	public ProfilePic(ProfilePic thePic)
	{
		filePath = thePic.filePath; 
		used = thePic.used;
	}
	public void setPath(String thePath)
	{
		filePath = thePath;
	}
	public void setUsed()
	{
		used = true;
	}
	public String toString()
	{
		return filePath;
	}
}
