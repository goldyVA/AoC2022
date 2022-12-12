import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day11Part1
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<Monkey> monkeys = new ArrayList<Monkey>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day11.txt"));
    	while(scan.hasNextLine())
    	{
    		list.add(scan.nextLine());
    	}
    }
    catch(Exception e) 
    {	
    }
    
    for(int i = 0; i < list.size(); i++)
    {
    	i++;
    	ArrayList<Integer> temp = new ArrayList<Integer>();
    	String t = list.get(i);
    	t=t.substring(t.indexOf(":")+2);
    	while(t.indexOf(",")>0)
    	{
    		temp.add(Integer.parseInt(t.substring(0,t.indexOf(","))));
    		t=t.substring(t.indexOf(",")+2);
    	}
    	temp.add(Integer.parseInt(t));
    	i++;
    	String operation = list.get(i).substring(list.get(i).indexOf("=")+2);
    	i++;
    	int test = Integer.parseInt(list.get(i).substring(list.get(i).indexOf("y")+2));
    	i++;
    	int iftrue = Integer.parseInt(list.get(i).substring(list.get(i).indexOf("y")+2));
    	i++;
    	int iffalse = Integer.parseInt(list.get(i).substring(list.get(i).indexOf("y")+2));
    	i++;
    	Monkey add = new Monkey(temp,operation,test,iftrue,iffalse);
    	monkeys.add(add);
    }
   for(int j = 0; j < 20; j++)
   {
	   for(int i = 0; i < monkeys.size(); i++)
	    {
	    	while(monkeys.get(i).items.size()>0)
	    	{
	    		String temp = monkeys.get(i).throwTo();
	    		int value = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
	    		temp = temp.substring(temp.indexOf(" " )+1);
	    		int to = Integer.parseInt(temp);
	    		monkeys.get(to).addValue(value);
	    		
	    	}
	    }
   }
   
   ArrayList<Integer> checks = new ArrayList<Integer>();
   for(Monkey x: monkeys)
   {
   	checks.add(x.checks);
   }
   Collections.sort(checks);
   System.out.println((long)checks.get(checks.size()-1)*(long)checks.get(checks.size()-2));
    
    
  }
}