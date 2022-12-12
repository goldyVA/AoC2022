import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day11Part2
{
  public static void main(String[] args) 
  {
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<Monkey2> monkeys = new ArrayList<Monkey2>();
    
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
    	ArrayList<Long> temp = new ArrayList<Long>();
    	String t = list.get(i);
    	t=t.substring(t.indexOf(":")+2);
    	while(t.indexOf(",")>0)
    	{
    		temp.add(Long.parseLong(t.substring(0,t.indexOf(","))));
    		t=t.substring(t.indexOf(",")+2);
    	}
    	temp.add(Long.parseLong(t));
    	i++;
    	String operation = list.get(i).substring(list.get(i).indexOf("=")+2);
    	i++;
    	long test = Integer.parseInt(list.get(i).substring(list.get(i).indexOf("y")+2));
    	i++;
    	long iftrue = Integer.parseInt(list.get(i).substring(list.get(i).indexOf("y")+2));
    	i++;
    	long iffalse = Integer.parseInt(list.get(i).substring(list.get(i).indexOf("y")+2));
    	i++;
    	Monkey2 add = new Monkey2(temp,operation,test,iftrue,iffalse);
    	monkeys.add(add);
    }
   for(int j = 0; j < 10000; j++)
   {
	   for(int i = 0; i < monkeys.size(); i++)
	    {
	    	while(monkeys.get(i).items.size()>0)
	    	{
	    		String temp = monkeys.get(i).throwTo();
	    		long value = Long.parseLong(temp.substring(0, temp.indexOf(" ")));
	    		temp = temp.substring(temp.indexOf(" " )+1);
	    		int to = Integer.parseInt(temp);
	    		monkeys.get(to).addValue(value);
	    		
	    	}
	    }
   }
   
    
    ArrayList<Integer> checks = new ArrayList<Integer>();
    for(Monkey2 x: monkeys)
    {
    	checks.add(x.checks);
    }
    Collections.sort(checks);
    System.out.println((long)checks.get(checks.size()-1)*(long)checks.get(checks.size()-2));
    		

 
    
    
  }
}