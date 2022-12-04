import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day4
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day4.txt"));
    	while(scan.hasNextLine())
    	{
    		list.add(scan.nextLine());
    	}
    }
    catch(Exception e) 
    {	
    }
    
    //part 1
    int count = 0;
    for(String x: list)
    {
    	int low1 = Integer.parseInt(x.substring(0, x.indexOf("-")));
    	x = x.substring(x.indexOf("-")+1);
    	int hi1 = Integer.parseInt(x.substring(0, x.indexOf(",")));
    	x = x.substring(x.indexOf(",")+1);
    	int low2 = Integer.parseInt(x.substring(0, x.indexOf("-")));
    	x = x.substring(x.indexOf("-")+1);
    	int hi2 = Integer.parseInt(x);
    	
    	if(low2 >= low1 && hi2 <= hi1 || low1 >= low2 && hi1 <= hi2)
    		count++;
    }
    System.out.println(count);
    
    //part 2
    count = 0;
    for(String x: list)
    {
    	int low1 = Integer.parseInt(x.substring(0, x.indexOf("-")));
    	x = x.substring(x.indexOf("-")+1);
    	int hi1 = Integer.parseInt(x.substring(0, x.indexOf(",")));
    	x = x.substring(x.indexOf(",")+1);
    	int low2 = Integer.parseInt(x.substring(0, x.indexOf("-")));
    	x = x.substring(x.indexOf("-")+1);
    	int hi2 = Integer.parseInt(x);
    	//System.out.println(low1 +" " + hi1 + " " + low2 + " " + hi2);
    	
    	if(low2 <= hi1 && low2 >= low1 || low1 <= hi2 && low1 >= low2)
    		count++;
    }
    System.out.println(count);
  }
}