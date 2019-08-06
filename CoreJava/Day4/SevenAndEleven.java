package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class SevenAndEleven 
{
	public static void main(String a[])
	{
		int sum=0;
		
		System.out.println("Enter the count of numbers you want to input");
		Scanner sc=new Scanner(System.in);
	
		int count=sc.nextInt();
		ArrayList<Integer> array=new ArrayList<>();
		for(int i=0;i<count;i++)
		{
			System.out.println("Enter number "+(i+1));
			int temp=sc.nextInt();
			if((temp%7)==0&&(temp%11)==0)
			{
			array.add(temp);
			}
		}
		for(int j=0;j<array.size();j++)
		{
			sum=sum+array.get(j);
		}
		if(sum==0)
		{
			System.out.println("There is no number you entered which is divisible by both 7 and 11 ");
		}
		else
		{
		System.out.println("Sum of numbers you entered which are divisible by 7 and 11 is "+sum);
	    }
	}

}
