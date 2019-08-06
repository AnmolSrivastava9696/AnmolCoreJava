package Basics;

import java.util.Scanner;

public class PrintBill
{
	public static double displayBill(double units)
	{
		double totalbill=0;
		if(units<100)
		{
			totalbill=totalbill+(units*1.50);
		}
			if(units<200&&units>100)
			{
				totalbill=totalbill+(100*1.50);
				units=units-100;
				totalbill=totalbill+(units*2.00);
			}
			if(units<250&&units>200)
			{
				totalbill=totalbill+350;
				units=units-200;
				totalbill=totalbill+(units*2.50);
			}
			if(units>=250)
			{
				totalbill=totalbill+475;
				units=units-250;
				totalbill=totalbill+(units*4.00);
			}
			return totalbill;
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the units consumed");
	double d=sc.nextDouble();
	double bill=displayBill(d);
	System.out.println(bill);
}
}
