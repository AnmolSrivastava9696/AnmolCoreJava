package Basics;

import java.util.Scanner;

public class FactorialExample
{
	public static void main(String args[])
	{
		int result=1;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		while(n>=1)
		{
			result=result*n;
			n--;
		}
		System.out.println("factorial of "+temp+" is "+result);
	}

}
