import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day9Part1
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<String> pos = new ArrayList<String>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day9.txt"));
    	while(scan.hasNextLine())
    	{
    		list.add(scan.nextLine());
    	}
    }
    catch(Exception e) 
    {	
    }
    
    int hx = 0;
    int hy = 0;
    int tx = 0;
    int ty = 0;
    
  for(String x: list)
  {
	  int moves = Integer.parseInt(x.substring(2));
	  if(x.charAt(0) == 'R')
	  {
		  for(int i = 0; i < moves; i++)
		  {
			  hx++;
			  if(!oneAway(hx,hy,tx,ty))
			  {
				  if(Math.abs(hx-tx)==2)
				  {
					  if(hy != ty)
					  {
						  if(hx > tx)
							  tx++;
						  else
							  tx--;
						  if(hy > ty)
							  ty++;
						  else
							  ty--;
							  
					  }
					  else
					  {
						  if(hx > tx)
							  tx++;
						  else
							  tx--;
					  }
				  }
			  }
			  String position = tx + " " + ty;
			  if(!pos.contains(position))
				  pos.add(position);
		  }
	  }
	  else if(x.charAt(0) == 'L')
	  {
		  for(int i = 0; i < moves; i++)
		  {
			  hx--;
			  if(!oneAway(hx,hy,tx,ty))
			  {
				  if(Math.abs(hx-tx)==2)
				  {
					  if(hy != ty)
					  {
						  if(hx > tx)
							  tx++;
						  else
							  tx--;
						  if(hy > ty)
							  ty++;
						  else
							  ty--;
							  
					  }
					  else
					  {
						  if(hx > tx)
							  tx++;
						  else
							  tx--;
					  }
				  }
			  }
			  String position = tx + " " + ty;
			  if(!pos.contains(position))
				  pos.add(position);
		  }
	  }
	  else if(x.charAt(0) == 'U')
	  {
		  for(int i = 0; i < moves; i++)
		  {
			  hy++;
			  if(!oneAway(hx,hy,tx,ty))
			  {
				  if(Math.abs(hy-ty)==2)
				  {
					  if(hx != tx)
					  {
						  if(hx > tx)
							  tx++;
						  else
							  tx--;
						  if(hy > ty)
							  ty++;
						  else
							  ty--;
							  
					  }
					  else
					  {
						  if(hy > ty)
							  ty++;
						  else
							  ty--;
					  }
				  }
			  }
			  String position = tx + " " + ty;
			  if(!pos.contains(position))
				  pos.add(position);
		  }
	  }
	  else//down
	  {
		  for(int i = 0; i < moves; i++)
		  {
			  hy--;
			  if(!oneAway(hx,hy,tx,ty))
			  {
				  if(Math.abs(hy-ty)==2)
				  {
					  if(hx != tx)
					  {
						  if(hx > tx)
							  tx++;
						  else
							  tx--;
						  if(hy > ty)
							  ty++;
						  else
							  ty--;
							  
					  }
					  else
					  {
						  if(hy > ty)
							  ty++;
						  else
							  ty--;
					  }
				  }
			  }
			  String position = tx + " " + ty;
			  if(!pos.contains(position))
				  pos.add(position);
		  }
	  }
  }
    
  System.out.println(pos.size());
 
    
    
    
    
    
  }
    		
    
  
  public static boolean oneAway(int ax, int ay, int bx, int by)
  {
	  if(Math.abs(ax - bx) <= 1 && Math.abs(ay - by) <= 1)
		  return true;
	  return false;
  }
  
  public static boolean oneAwayX(int ax, int bx)
  {
	  if(Math.abs(ax - bx) <= 1)
		  return true;
	  return false;
  }
  
  public static boolean oneAwayY(int ay, int by)
  {
	  if(Math.abs(ay - by) <= 1)
		  return true;
	  return false;
  }
}