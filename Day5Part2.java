import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*; // Import the Scanner class to read text files

public class Day5Part2
{
  public static void main(String[] args) 
  {
    ArrayList<Character> one = new ArrayList<Character>();
    ArrayList<Character> two = new ArrayList<Character>();
    ArrayList<Character> three = new ArrayList<Character>();
    ArrayList<Character> four = new ArrayList<Character>();
    ArrayList<Character> five = new ArrayList<Character>();
    ArrayList<Character> six = new ArrayList<Character>();
    ArrayList<Character> seven = new ArrayList<Character>();
    ArrayList<Character> eight = new ArrayList<Character>();
    ArrayList<Character> nine = new ArrayList<Character>();
    
    one.add('W');
    one.add('D');
    one.add('G');
    one.add('B');
    one.add('H');
    one.add('R');
    one.add('V');
    two.add('J');
    two.add('N');
    two.add('G');
    two.add('C');
    two.add('R');
    two.add('F');
    three.add('L');
    three.add('S');
    three.add('F');
    three.add('H');
    three.add('D');
    three.add('N');
    three.add('J');
    four.add('J');
    four.add('D');
    four.add('S');
    four.add('V');
    five.add('S');
    five.add('H');
    five.add('D');
    five.add('R');
    five.add('Q');
    five.add('W');
    five.add('N');
    five.add('V');
    six.add('P');
    six.add('G');
    six.add('H');
    six.add('C');
    six.add('M');
    seven.add('F');
    seven.add('J');
    seven.add('B');
    seven.add('G');
    seven.add('L');
    seven.add('Z');
    seven.add('H');
    seven.add('C');
    eight.add('S');
    eight.add('J');
    eight.add('R');
    nine.add('L');
    nine.add('G');
    nine.add('S');
    nine.add('R');
    nine.add('B');
    nine.add('N');
    nine.add('V');
    nine.add('M');
    
    ArrayList<String> list = new ArrayList<String>();
    
    try 
    {
    	Scanner scan = new Scanner(new File("day5.txt"));
    	while(scan.hasNextLine())
    	{
    		list.add(scan.nextLine());
    	}
    }
    catch(Exception e) 
    {	
    }
    
    int count = 0;
    for(String x: list)
    {
    	int howMany = Integer.parseInt(x.substring(x.indexOf(" ")+1,x.indexOf(" f")));
    	int start = Integer.parseInt(x.substring(x.indexOf("m ")+2,x.indexOf(" t")));
    	int finish = Integer.parseInt(x.substring(x.indexOf("o ")+2));
    	System.out.println(howMany + " " + start + " " + finish);
    	
    	ArrayList<Character> temp = new ArrayList<Character>();
    	if(start == 1)
    	{
    		for(int i = 0; i < howMany; i++)
    		{
    			temp.add(one.remove(one.size()-1));
    		}		
    	}
    	else if(start == 2)
    	{
    		for(int i = 0; i < howMany; i++)
    		{
    			temp.add(two.remove(two.size()-1));
    		}		
    	}
    	else if(start == 3)
    	{
    		for(int i = 0; i < howMany; i++)
    		{
    			temp.add(three.remove(three.size()-1));
    		}		
    	}
    	else if(start == 4)
    	{
    		for(int i = 0; i < howMany; i++)
    		{
    			temp.add(four.remove(four.size()-1));
    		}		
    	}
    	else if(start == 5)
    	{
    		for(int i = 0; i < howMany; i++)
    		{
    			temp.add(five.remove(five.size()-1));
    		}		
    	}
    	else if(start == 6)
    	{
    		for(int i = 0; i < howMany; i++)
    		{
    			temp.add(six.remove(six.size()-1));
    		}		
    	}
    	else if(start == 7)
    	{
    		for(int i = 0; i < howMany; i++)
    		{
    			temp.add(seven.remove(seven.size()-1));
    		}		
    	}
    	else if(start == 8)
    	{
    		for(int i = 0; i < howMany; i++)
    		{
    			temp.add(eight.remove(eight.size()-1));
    		}		
    	}
    	else if(start == 9)
    	{
    		for(int i = 0; i < howMany; i++)
    		{
    			temp.add(nine.remove(nine.size()-1));
    		}		
    	}
    	
    	if(finish == 1)
    	{
    		while(temp.size()>0)
    			one.add(temp.remove(temp.size()-1));
    	}
    	else if(finish == 2)
    	{
    		while(temp.size()>0)
    			two.add(temp.remove(temp.size()-1));
    	}
    	else if(finish == 3)
    	{
    		while(temp.size()>0)
    			three.add(temp.remove(temp.size()-1));
    	}
    	else if(finish == 4)
    	{
    		while(temp.size()>0)
    			four.add(temp.remove(temp.size()-1));
    	}
    	else if(finish == 5)
    	{
    		while(temp.size()>0)
    			five.add(temp.remove(temp.size()-1));
    	}
    	else if(finish == 6)
    	{
    		while(temp.size()>0)
    			six.add(temp.remove(temp.size()-1));
    	}
    	else if(finish == 7)
    	{
    		while(temp.size()>0)
    			seven.add(temp.remove(temp.size()-1));
    	}
    	else if(finish == 8)
    	{
    		while(temp.size()>0)
    			eight.add(temp.remove(temp.size()-1));
    	}
    	else if(finish == 9)
    	{
    		while(temp.size()>0)
    			nine.add(temp.remove(temp.size()-1));
    	}
    	
    }
    
    
    
    for(char x: one)
    {
    	System.out.print(x+ " ");
    }
    System.out.println();
    for(char x: two)
    {
    	System.out.print(x+ " ");
    }
    System.out.println();
    for(char x: three)
    {
    	System.out.print(x+ " ");
    }
    System.out.println();
    for(char x: four)
    {
    	System.out.print(x+ " ");
    }
    System.out.println();
    for(char x: five)
    {
    	System.out.print(x+ " ");
    }
    System.out.println();
    for(char x: six)
    {
    	System.out.print(x+ " ");
    }
    System.out.println();
    for(char x: seven)
    {
    	System.out.print(x+ " ");
    }
    System.out.println();
    for(char x: eight)
    {
    	System.out.print(x+ " ");
    }
    System.out.println();
    for(char x: nine)
    {
    	System.out.print(x+ " ");
    }
    System.out.println();    
  }
}