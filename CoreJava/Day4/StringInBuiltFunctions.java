package Basics;

public class StringInBuiltFunctions
{
	//compareTo method is case case sensitive
	//compareToIgnoreCase case insensitive
	//substring start index included last index excluded
	public static void main(String args[])
	{
		
	
	    
		String a= "I am learning core java";
		

	    String b="I Am Learning Core Java";	
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(a.compareToIgnoreCase(b));

		/*System.out.println(c);
		System.out.println("Position of a starting from index 0 "+a.indexOf('a'));
		System.out.println("Position of a starting from index 10 "+a.indexOf('a',10));*/
		

	}
	}
	
	


