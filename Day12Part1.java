import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day12Part1
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day12.txt"));
    	while(scan.hasNextLine())
    	{
    		list.add(scan.nextLine());
    	}
    }
    catch(Exception e) 
    {	
    }
    
    int[][] grid = new int[list.size()][list.get(0).length()];
    
    
    int startX = 0;
    int startY = 0;
    int endX = 0;
    int endY = 0;
    for(int i = 0; i < list.size(); i++)
    {
    	for(int j = 0; j < list.get(0).length(); j++)
    	{
    		grid[i][j] = (int)list.get(i).charAt(j);
    		if(list.get(i).charAt(j) == 'S')
    		{
    			startX = i;
    			startY = j;
    			grid[i][j] = 'a';
    		}
    		if(list.get(i).charAt(j) == 'E')
    		{
    			endX = i;
    			endY = j;
    			grid[i][j] = 'z';
    		}
    		
    		
    	}
    }
    
    HashMap<String, Integer> cost = new HashMap<String, Integer>();
    for(int i = 0; i < list.size(); i++)
    {
    	for(int j = 0; j < list.get(0).length(); j++)
    	{
    		cost.put(i+ "," + j, Integer.MAX_VALUE);
    	}
    }
    
    cost.replace(startX+","+startY, 0);
	ArrayList<String> toCheck = new ArrayList<String>();
	toCheck.add(startX+","+startY);
	
	
	
	
	while(toCheck.size() > 0 )
	{
		ArrayList<String> newCheck = new ArrayList<String>();
		for(int i = 0; i < toCheck.size(); i++)
		{
			int r = Integer.parseInt(toCheck.get(i).substring(0,toCheck.get(i).indexOf(",")));
			int c = Integer.parseInt(toCheck.get(i).substring(toCheck.get(i).indexOf(",")+1));
			String current = r+","+c;
			String left = r+","+(c-1);
			String right = r+","+(c+1);
			String up = r-1+","+c;
			String down = r+1+","+c;
			
			if(cost.containsKey(right) && grid[r][c+1] - grid[r][c] <= 1)
			{
				if(cost.get(right) > cost.get(current)+1)
				{
					cost.replace(right, cost.get(current)+1);
					if(!newCheck.contains(right))
						newCheck.add(right);
				}
			}
			if(cost.containsKey(down) && grid[r+1][c] - grid[r][c] <= 1)
			{
				if(cost.get(down) > cost.get(current)+1)
				{
					cost.replace(down, cost.get(current)+1);
					if(!newCheck.contains(down))
						newCheck.add(down);
				}
			}
			if(cost.containsKey(left) && grid[r][c-1] - grid[r][c] <= 1)
			{
				if(cost.get(left) > cost.get(current)+1)
				{
					cost.replace(left, cost.get(current)+1);
					if(!newCheck.contains(left))
						newCheck.add(left);
				}
			}
			if(cost.containsKey(up) && grid[r-1][c] - grid[r][c] <= 1)
			{
				if(cost.get(up) > cost.get(current)+1)
				{
					cost.replace(up, cost.get(current)+1);
					if(!newCheck.contains(up))
						newCheck.add(up);
				}
			}
			
		}
		toCheck.clear();
		for(String x: newCheck)
			toCheck.add(x);
	}
	
	System.out.println(cost.get(endX+","+endY));
    
    
    
    
  }
}