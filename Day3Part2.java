import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day3Part2
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
    
    ArrayList<Character> badges = new ArrayList<Character>();
    for(int i = 0; i < list.size(); i+=3)
    {
    	String first = list.get(i);
    	String second = list.get(i+1);
    	String third = list.get(i+2);
    	for(int j = 0; j < first.length(); j++)
    	{
    		if(second.indexOf(first.substring(j,j+1))>=0 && third.indexOf(first.substring(j,j+1))>=0)
    		{
    			badges.add(first.charAt(j));
    			j = first.length();
    		}			
    	}
    }
    
    int sum = 0;
    for(char x: badges)
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