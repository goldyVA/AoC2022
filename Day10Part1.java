import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day10Part1
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    
    
    try 
    {
    	Scanner scan = new Scanner(new File("day10.txt"));
    	while(scan.hasNextLine())
    	{
    		list.add(scan.nextLine());
    	}
    }
    catch(Exception e) 
    {	
    }
    
    long x = 1;
    long cycle = 0;
    long signal = 0;
    
    for(String a: list)
    {
    	if(a.substring(0,4).equals("noop"))
    	{
    		cycle++;
    		if(cycle == 20 || cycle == 60 || cycle == 100 || cycle == 140 || cycle == 180 || cycle == 220)
    		{
    			System.out.println(x+ " " + cycle + " " +(x*cycle));
    			signal += x*cycle;
    		}
    	}
    	else
    	{
    		cycle++;
    		if(cycle == 20 || cycle == 60 || cycle == 100 || cycle == 140 || cycle == 180 || cycle == 220)
    		{
    			System.out.println(x+ " " + cycle + " " +(x*cycle));
    			signal += x*cycle;
    		}
    		cycle++;
    		if(cycle == 20 || cycle == 60 || cycle == 100 || cycle == 140 || cycle == 180 || cycle == 220)
    		{
    			System.out.println(x+ " " + cycle + " " +(x*cycle));
    			signal += x*cycle;
    		}
    		x += Integer.parseInt(a.substring(5));
    	}
    		
    }
    
    System.out.println(signal);
    
    
    
  }
}