import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day7fromFilePaths
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day7FilePaths.txt"));
    	while(scan.hasNextLine())
    	{
    		list.add(scan.nextLine());
    	}
    }
    catch(Exception e) 
    {	
    }
    
    ArrayList<String> directories = new ArrayList<String>();
    for(String x: list)
    {
    	ArrayList<Integer> slashIndex = new ArrayList<Integer>();
    	for(int i = 0; i < x.length(); i++)
    	{
    		if(x.charAt(i) == '/')
    			slashIndex.add(i);
    	}
    	for(int y: slashIndex)
    	{
    		if(!directories.contains(x.substring(0,y+1)))
    			directories.add(x.substring(0,y+1));
    			
    	}
    }
    
    long sum = 0;
    for(String x: directories)
    {
    	long count = 0;
    	for(String y: list)
    	{
    		if(y.contains(x)&&y.contains(" "))
    			count += Long.parseLong(y.substring(y.indexOf(" ")+1));	
    	}
    	if(count <= 100000)
    		sum += count;
    }
    System.out.println(sum);
    
    
    long amount = 0;;
    for(String x: list)
    {
    	if(x.contains(" "))
    	{
    		amount += Long.parseLong(x.substring(x.indexOf(" ")+1));
    	}
    }
 
    
    
    ArrayList<Long> deletes = new ArrayList<Long>();
    for(String x: directories)
    {
    	long count = 0;
    	for(String y: list)
    	{
    		if(y.contains(x)&&y.contains(" "))
    			count += Long.parseLong(y.substring(y.indexOf(" ")+1));	
    	}
    	//System.out.println(count);
    	if(70000000 - amount + count >= 30000000)
    		deletes.add(count);
    }
    Collections.sort(deletes);
    System.out.println(deletes.get(0));
    
    
    
    
    
    
    
    
    
    
  }
}