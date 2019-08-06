package Basics;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String args[])
	{
		int i=3;
		int a=1;
		int b=2;
		System.out.println("Enter the numbers of digits to be printed in series");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("1 2 ");
		while(i<=n)
		{
		
			int sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			i++;
		}
		
	}

}
