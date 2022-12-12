import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day7
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<String> directories = new ArrayList<String>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day7.txt"));
    	while(scan.hasNextLine())
    	{
    		list.add(scan.nextLine());
    	}
    }
    catch(Exception e) 
    {	
    }
    
    for(String x: list)
    {
    	if(x.contains("dir "))
    	{
    		directories.add(x.substring(x.indexOf("dir ")+4));
    	}
    }
    
    ArrayList<String> files = new ArrayList<String>();
    String filepath = "";
    
    for(int i = 0; i < list.size(); i++)
    {
    	String x = list.get(i);
    	if(x.charAt(0) == '$' && !x.equals("$ ls"))
    	{
    		if(x.equals("$ cd /"))
    			filepath = "/";
    		else if(x.equals("$ cd .."))
    		{
    			filepath = filepath.substring(0,filepath.lastIndexOf("/"));
    			filepath = filepath.substring(0,filepath.lastIndexOf("/")+1);
    		}	
    		else
    			filepath += x.substring(x.lastIndexOf(" ")+1) + "/";
    		
    	}
    	//if(x.equals("$ ls"))
    	//{
    		//go to the next line
    	//}
    	if(!x.contains("$"))
    	{
    		String toAdd = list.get(i).substring(list.get(i).indexOf(" ")+1);
    		if(!list.get(i).substring(0,3).equals("dir"))
    		{
    			String size = list.get(i).substring(0,list.get(i).indexOf(" "));
    			toAdd+= " " + size;
    		}
    		System.out.println(filepath+toAdd);
    		files.add(filepath+toAdd);
    	}
    	
    }
    
    
  }
}