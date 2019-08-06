package Basics;
import java.util.*;
public class ArrayLsitIterator 
{
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<>();
		a.add("Virat Kohli");
		a.add("Rohit Sharma");
		a.add("MS Dhoni");
		a.add("Bhuvneshwar Kumar");
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
				
		
		
	}

}
