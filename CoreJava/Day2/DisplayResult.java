package Basics;
import java.io.*;
import java.util.Scanner;
public class DisplayResult
{
	public static void displayResult(double percentage)
	{
		if(percentage>=75)
		{
			System.out.println("fcd");
		}
		else 
			if(percentage<75&&percentage>=65)
			{
				System.out.println("fc");
			}
			else 
				if(percentage<65&&percentage>=50)
				{
					System.out.println("sc");	
				}
				else 
					if(percentage<50&&percentage>=35)
					{
						System.out.println("pc");	
					}
					else
					{
						System.out.println("f");
					}
	}
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter your percentage");
	double d=sc.nextDouble();
	displayResult(d);
}
}
