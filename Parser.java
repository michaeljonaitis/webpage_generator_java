import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Parser {


	StringTokenizer token;
	String str;
	List <List<String>> list = new ArrayList <List<String>>();
	
	Parser(BufferedReader reader) throws IOException
	{
		String line = reader.readLine();
		List<String> alist = new ArrayList<String>();
		
		
		while(line != null)
		{
			
			token = new StringTokenizer(line);

			while(token.hasMoreTokens())
			{
				nextWord();
				alist.add(str);
			}
			
			list.add(alist);
			alist = new ArrayList<String>();
			line = reader.readLine();
		}
	}
	public void nextWord()	
	{	
		str = token.nextToken();
	}
	public void printList()
	{
		int i = 0;
		
		while(i < list.size())
		{
			System.out.println(list.get(i));
			i++;
		}
	}
	
}
