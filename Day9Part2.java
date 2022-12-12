import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day9Part2
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
    
    ArrayList<Knot> knot = new ArrayList<Knot>();
    for(int i = 0; i < 10; i++)
    {
    	knot.add(new Knot());
    }
   
    
    
  for(String x: list)
  {
	  int moves = Integer.parseInt(x.substring(2));
	  if(x.charAt(0) == 'R')
	  {
		  for(int i = 0; i < moves; i++)
		  {
			  knot.get(0).setX(knot.get(0).getX()+1);
			  for(int j = 1; j <knot.size(); j++)
			  {
				  int hx = knot.get(j-1).getX();
				  int hy = knot.get(j-1).getY();
				  int tx = knot.get(j).getX();
				  int ty = knot.get(j).getY();
				  
				  if(!oneAway(hx,hy,tx,ty))
				  {
					  if(Math.abs(hx-tx)==2)
					  {
						  if(hy != ty)
						  {
							  if(hx > tx)
								  knot.get(j).setX(tx+1);
							  else
								  knot.get(j).setX(tx-1);
							  if(hy > ty)
								  knot.get(j).setY(ty+1);
							  else
								  knot.get(j).setY(ty-1);
								  
						  }
						  else
						  {
							  if(hx > tx)
								  knot.get(j).setX(tx+1);
							  else
								  knot.get(j).setX(tx-1);
						  }
					  }
					  else
					  {
						  if(hx != tx)
						  {
							  if(hx > tx)
								  knot.get(j).setX(tx+1);
							  else
								  knot.get(j).setX(tx-1);
							  if(hy > ty)
								  knot.get(j).setY(ty+1);
							  else
								  knot.get(j).setY(ty-1);
								  
						  }
						  else
						  {
							  if(hy > ty)
								  knot.get(j).setY(ty+1);
							  else
								  knot.get(j).setY(ty-1);
						  }
					  }
				  }
			  }
			  
			  String position = knot.get(knot.size()-1).getX() + " " + knot.get(knot.size()-1).getY();
			  if(!pos.contains(position))
				  pos.add(position);
		  }
	  }
	  else if(x.charAt(0) == 'L')
	  {
		  for(int i = 0; i < moves; i++)
		  {
			  knot.get(0).setX(knot.get(0).getX()-1);
			  for(int j = 1; j <knot.size(); j++)
			  {
				  int hx = knot.get(j-1).getX();
				  int hy = knot.get(j-1).getY();
				  int tx = knot.get(j).getX();
				  int ty = knot.get(j).getY();
				  
				  if(!oneAway(hx,hy,tx,ty))
				  {
					  if(Math.abs(hx-tx)==2)
					  {
						  if(hy != ty)
						  {
							  if(hx > tx)
								  knot.get(j).setX(tx+1);
							  else
								  knot.get(j).setX(tx-1);
							  if(hy > ty)
								  knot.get(j).setY(ty+1);
							  else
								  knot.get(j).setY(ty-1);
								  
						  }
						  else
						  {
							  if(hx > tx)
								  knot.get(j).setX(tx+1);
							  else
								  knot.get(j).setX(tx-1);
						  }
					  }
					  else
					  {
						  if(hx != tx)
						  {
							  if(hx > tx)
								  knot.get(j).setX(tx+1);
							  else
								  knot.get(j).setX(tx-1);
							  if(hy > ty)
								  knot.get(j).setY(ty+1);
							  else
								  knot.get(j).setY(ty-1);
								  
						  }
						  else
						  {
							  if(hy > ty)
								  knot.get(j).setY(ty+1);
							  else
								  knot.get(j).setY(ty-1);
						  }
					  }
				  }
			  }
			  
			  String position = knot.get(knot.size()-1).getX() + " " + knot.get(knot.size()-1).getY();
			  if(!pos.contains(position))
				  pos.add(position);
		  }
	  }
	  else if(x.charAt(0) == 'U')
	  {
		  for(int i = 0; i < moves; i++)
		  {
			  knot.get(0).setY(knot.get(0).getY()+1);
			  for(int j = 1; j <knot.size(); j++)
			  {
				  int hx = knot.get(j-1).getX();
				  int hy = knot.get(j-1).getY();
				  int tx = knot.get(j).getX();
				  int ty = knot.get(j).getY();
				  
				  if(!oneAway(hx,hy,tx,ty))
				  {
					  if(Math.abs(hx-tx)==2)
					  {
						  if(hy != ty)
						  {
							  if(hx > tx)
								  knot.get(j).setX(tx+1);
							  else
								  knot.get(j).setX(tx-1);
							  if(hy > ty)
								  knot.get(j).setY(ty+1);
							  else
								  knot.get(j).setY(ty-1);
								  
						  }
						  else
						  {
							  if(hx > tx)
								  knot.get(j).setX(tx+1);
							  else
								  knot.get(j).setX(tx-1);
						  }
					  }
					  else
					  {
						  if(hx != tx)
						  {
							  if(hx > tx)
								  knot.get(j).setX(tx+1);
							  else
								  knot.get(j).setX(tx-1);
							  if(hy > ty)
								  knot.get(j).setY(ty+1);
							  else
								  knot.get(j).setY(ty-1);
								  
						  }
						  else
						  {
							  if(hy > ty)
								  knot.get(j).setY(ty+1);
							  else
								  knot.get(j).setY(ty-1);
						  }
					  }
				  }
			  }
			  
			  String position = knot.get(knot.size()-1).getX() + " " + knot.get(knot.size()-1).getY();
			  if(!pos.contains(position))
				  pos.add(position);
		  }
	  }
	  else//down
	  {
		  for(int i = 0; i < moves; i++)
		  {
			  knot.get(0).setY(knot.get(0).getY()-1);
			  for(int j = 1; j <knot.size(); j++)
			  {
				  int hx = knot.get(j-1).getX();
				  int hy = knot.get(j-1).getY();
				  int tx = knot.get(j).getX();
				  int ty = knot.get(j).getY();
				  
				  if(!oneAway(hx,hy,tx,ty))
				  {
					  if(Math.abs(hx-tx)==2)
					  {
						  if(hy != ty)
						  {
							  if(hx > tx)
								  knot.get(j).setX(tx+1);
							  else
								  knot.get(j).setX(tx-1);
							  if(hy > ty)
								  knot.get(j).setY(ty+1);
							  else
								  knot.get(j).setY(ty-1);
								  
						  }
						  else
						  {
							  if(hx > tx)
								  knot.get(j).setX(tx+1);
							  else
								  knot.get(j).setX(tx-1);
						  }
					  }
					  else
					  {
						  if(hx != tx)
						  {
							  if(hx > tx)
								  knot.get(j).setX(tx+1);
							  else
								  knot.get(j).setX(tx-1);
							  if(hy > ty)
								  knot.get(j).setY(ty+1);
							  else
								  knot.get(j).setY(ty-1);
								  
						  }
						  else
						  {
							  if(hy > ty)
								  knot.get(j).setY(ty+1);
							  else
								  knot.get(j).setY(ty-1);
						  }
					  }
				  }
			  }
			  
			  String position = knot.get(knot.size()-1).getX() + " " + knot.get(knot.size()-1).getY();
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

class Knot
{
	int x;
	int y;
	
	public Knot()
	{
		x = 0;
		y = 0;
	}
	
	public void setX(int a)
	{
		x = a;
	}
	
	public void setY(int a)
	{
		y = a;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
}