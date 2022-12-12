import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day8Part1
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day8.txt"));
    	while(scan.hasNextLine())
    	{
    		list.add(scan.nextLine());
    	}
    }
    catch(Exception e) 
    {	
    }
    
    int[][] forest = new int[list.size()][list.get(0).length()];
    for(int i = 0; i < list.size(); i++)
    {
    	for(int j = 0; j < list.get(0).length(); j++)
    	{
    		forest[i][j] = Integer.parseInt(list.get(i).substring(j,j+1));
    	}
    }
    
    int count = 0;
    for(int i = 0; i < list.size(); i++)
    {
    	for(int j = 0; j < list.get(0).length(); j++)
    	{
    		boolean isVisible = false;
    		if(i == 0 || j == 0 || i == forest.length-1 || j == forest[i].length -1)
    		{
    			isVisible = true;
    		}
    		else
    		{
    			int a = i;
    			int b = j;
    			a--;
    			isVisible = true;
    			while(a>=0)
    			{
    				if(forest[i][j] <= forest[a][b])
    				{
    					isVisible = false;
    				}
    				a--;
    			}
    			if(!isVisible)
    			{
    				a = i;
        			b = j;
        			b--;
        			isVisible = true;
        			while(b>=0)
        			{
        				if(forest[i][j] <= forest[a][b])
        				{
        					isVisible = false;
        				}
        				b--;
        			}
    			}
    			if(!isVisible)
    			{
    				a = i;
        			b = j;
        			a++;
        			isVisible = true;
        			while(a<=forest.length-1)
        			{
        				if(forest[i][j] <= forest[a][b])
        				{
        					isVisible = false;
        				}
        				a++;
        			}
    			}
    			if(!isVisible)
    			{
    				a = i;
        			b = j;
        			b++;
        			isVisible = true;
        			while(b<=forest[0].length-1)
        			{
        				if(forest[i][j] <= forest[a][b])
        				{
        					isVisible = false;
        				}
        				b++;
        			}
    			}
    			
    			
    			
    		}
    		if(isVisible)
    			count++;
    		
    		
    	}	
    }
    System.out.println(count);
    
    

    		
   
    
    
    
    
    
    
  }
}