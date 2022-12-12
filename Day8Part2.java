import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day8Part2
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
    
    int scenicScore = 0;
    for(int i = 0; i < list.size(); i++)
    {
    	for(int j = 0; j < list.get(0).length(); j++)
    	{
    		int left = 0;
    		int right = 0;
    		int up = 0;
    		int down =0;
    		
			int a = i;
			int b = j;
			a--;
			while(a>0)
			{
				if(forest[i][j] > forest[a][b])
				{
					up++;
					a--;
				}
				else
					a=-1;
				
			}
			a = i;
			b = j;
			b--;
			while(b>0)
			{
				if(forest[i][j] > forest[a][b])
				{
					left++;
					b--;
				}
				else
					b=-1;
				
			}
			a = i;
			b = j;
			a++;
			while(a<forest.length-1)
			{
				if(forest[i][j] > forest[a][b])
				{
					down++;
					a++;
				}
				else
					a=forest.length;
				
			}
			a = i;
			b = j;
			b++;
			while(b<forest[0].length-1)
			{
				if(forest[i][j] > forest[a][b])
				{
					right++;
					b++;
				}
				else
					b=forest.length;
				
			}
			left++;
			right++;
			up++;
			down++;
			int product = left*right*up*down;
			if(product > scenicScore)
				scenicScore = product;
			
			
			
			
		}
    		
    		
    		
    	
    }
    System.out.println(scenicScore);
    
    

    		
   
    
    
    
    
    
    
  }
}