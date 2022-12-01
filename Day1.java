import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day1 
{
  public static void main(String[] args) 
  {
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day1.txt"));
    	int sum = 0;
    	while(scan.hasNextInt())
    	{
    		String temp = scan.nextLine();
    		if(temp.length()>0)
    		{
    			sum += Integer.parseInt(temp);
    		}
    		else
    		{
    			list.add(sum);
    			sum = 0;
    		}
    	}
    }
    catch(Exception e) 
    {	
    }
    
    
    Collections.sort(list);
    System.out.println(list.get(list.size()-1));
    System.out.println(list.get(list.size()-1)+list.get(list.size()-2)+list.get(list.size()-3));
  }
}