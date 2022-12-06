import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day6
{
  public static void main(String[] args) 
  { 
    String marker = "";
    
    try 
    {
    	Scanner scan = new Scanner(new File("day6.txt"));
    	while(scan.hasNextLine())
    	{
    		marker = scan.nextLine();
    	}
    }
    catch(Exception e) 
    {	
    }
    
    int seqLength = 14;
    for(int i = 0; i < marker.length(); i++)
    {
    	String check = marker.substring(i,i+seqLength);
    	boolean found = false;
    	for(int j = 0; j < check.length(); j++)
    	{
    		char spot = check.charAt(j);
    		int count = 0;
    		for(int k = 0; k < check.length(); k++)
    		{
    			if(spot == check.charAt(k))
    				count++;
    		}
    		if(count > 1)
    		{
    			found = true;
    		}
    	}
    	if(!found)
    	{
    		System.out.println(i+seqLength);
    		i = marker.length();
    	}
    		
    } 
  }
}