import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day10Part2
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
    
    int x = 1;
    int cycle = 0;
    int signal = 0;
    int pixel = 0;
    
    for(String a: list)
    {
    	if(a.substring(0,4).equals("noop"))
    	{
    		cycle++;
    		if(x == pixel || x - 1 == pixel || x + 1 == pixel)
    		{
    			System.out.print("#");
    			pixel++;
    			if(cycle%40 == 0)
    			{
    				System.out.println();
    				pixel = 0;
    			}
    		}
    		else
    		{
    			System.out.print(" ");
    			pixel++;
    			if(cycle%40 == 0)
    			{
    				System.out.println();
    				pixel = 0;
    			}
    		}
    	}
    	else
    	{
    		cycle++;
    		if(x == pixel || x - 1 == pixel || x + 1 == pixel)
    		{
    			System.out.print("#");
    			pixel++;
    			if(cycle%40 == 0)
    			{
    				System.out.println();
    				pixel = 0;
    			}
    		}
    		else
    		{
    			System.out.print(" ");
    			pixel++;
    			if(cycle%40 == 0)
    			{
    				System.out.println();
    				pixel = 0;
    			}
    		}
    		cycle++;
    		if(x == pixel || x - 1 == pixel || x + 1 == pixel)
    		{
    			System.out.print("#");
    			pixel++;
    			if(cycle%40 == 0)
    			{
    				System.out.println();
    				pixel = 0;
    			}
    		}
    		else
    		{
    			System.out.print(" ");
    			pixel++;
    			if(cycle%40 == 0)
    			{
    				System.out.println();
    				pixel = 0;
    			}
    		}
    		x += Integer.parseInt(a.substring(5));
    	}
    		
    }
    
    
    
    
    
  }
}