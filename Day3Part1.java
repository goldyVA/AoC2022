import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day3Part1
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day3.txt"));
    	while(scan.hasNextLine())
    	{
    		list.add(scan.nextLine());
    	}
    }
    catch(Exception e) 
    {	
    }
    
    ArrayList<Character> repeats = new ArrayList<Character>();
    for(String x: list)
    {
    	String first = x.substring(0,x.length()/2);
    	String second = x.substring(x.length()/2);
    	for(int i = 0; i < first.length(); i++)
    	{
    		if(second.indexOf(first.substring(i,i+1))>=0)
    		{
    			int index = second.indexOf(first.substring(i,i+1));
    			repeats.add(second.charAt(index));
    			i = first.length();
    		}			
    	}
    }
    
    int sum = 0;
    for(char x: repeats)
    {
    	if((int)x >= 97)
    	{
    		sum += (int)x - 96;
    	}
    		
    	else
    	{
    		sum += (int)x - 38;
    	}
    		
    }
    System.out.println(sum);
    
   
  }
  
  
}