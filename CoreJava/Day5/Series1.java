package Basics;

import java.util.Scanner;

public class Series1 
{
	public static void main(String args[]){
	System.out.println("Enter the number of digits to be printrd in series");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=0;
	int a=2;
	int d=1;
	while(i<n)
	{
		a=a+d;
		System.out.print(a+" ");
		d++;
		i++;
	}
	}
}
