package Basics;

import java.util.Scanner;

public class CheckArmstrong 
{
	public static void checkArmstrong(int n)
	{
		int temp=n;
		int sum=0;
		int remainder=0;
		while(remainder<10)
		{
			remainder=n%10;
			sum=sum+(remainder*remainder*remainder);
			n=n/10;
		
			
		}
		if(sum==temp)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}
		
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number to be checked for armstrong");
	int n=sc.nextInt();
	checkArmstrong(n);
}
}
