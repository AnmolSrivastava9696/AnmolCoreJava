package Basics;
import java.util.Scanner;


public class SwichExample2 
{
	public static void function(int n)
	{
		while(n>0)
		{
			int remainder=n%10;
			n=n/10;
			switch(remainder)
			{
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			case 6:
				System.out.println("six");
				break;
			case 7:
				System.out.println("seven");
				break;
			case 8:
				System.out.println("eight");
				break;
			case 9:
				System.out.println("nine");
				break;
			}
		}
	}
	
	public static void main(String args[])
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int r=sc.nextInt();
	function(r);
	
	}
	

}
