import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day2Part2 
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day2.txt"));
    	while(scan.hasNextLine())
    	{
    		list.add(scan.nextLine());
    	}
    }
    catch(Exception e) 
    {	
    }
    
    int score = 0;
    for(String x: list)
    {
    	String elf = x.substring(0,1);
    	String you = x.substring(2,3);
    	score += getScore(elf, you);	
    }
    
    System.out.println(score);
  }
  
  public static int getScore(String elf, String you)
  {
	  if(elf.equals("A"))//rock
  	{
  		if(you.equals("X"))//lose scissors
  		{
  			return 3 + 0;
  		}
  		else if(you.equals("Y"))//draw rock
  		{
  			return 1 + 3;
  		}
  		else				//win paper
  		{
  			return 2 + 6;
  		}
  	}
  	else if(elf.equals("B"))//paper
  	{
  		if(you.equals("X"))// lose rock
  		{
  			return 1 + 0;
  		}
  		else if(you.equals("Y"))// draw paper
  		{
  			return 2 + 3;
  		}
  		else				// win scissors
  		{
  			return 3 + 6;
  		}
  	}
  	else					//scissors
  	{
  		if(you.equals("X"))//lose paper
  		{
  			return 2 + 0;
  		}
  		else if(you.equals("Y"))//draw scissors
  		{
  			return 3 + 3;
  		}
  		else				//win rock
  		{
  			return 1 + 6;
  		}
  	}
  }
  
  
}