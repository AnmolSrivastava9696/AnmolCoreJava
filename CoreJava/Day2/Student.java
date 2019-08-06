package Basics;

import java.util.Scanner;

public class Student 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String student1;
	String student2;
	String student3;
	int a=0;
	int b=0;
	int c=0;
    System.out.println("Enter the name of first student");
    student1=sc.next();
	System.out.println("enter the marks of " + student1);
	for(int i=0;i<4;i++)
	{
		System.out.println("enter the marks of subject " + (i+1));
		a=a+sc.nextInt();
	}
	double average1=a/4;
	System.out.println("Enter the name of second student");
    student2=sc.next();
	System.out.println("enter the marks of " + student2);
	for(int i=0;i<4;i++)
	{
		System.out.println("enter the marks of subject " + (i+1));
		b=b+sc.nextInt();
	}
	double average2=b/4;
	System.out.println("Enter the name of third student");
    student3=sc.next();
	System.out.println("enter the marks of " + student3);
	for(int i=0;i<4;i++)
	{
		System.out.println("enter the marks of subject " + (i+1));
		c=c+sc.nextInt();
	}
	double average3=c/4;
	if(average1>average2)
	{
		if(average1>average3)
		{
			System.out.println("Details of student who obtained higest Student: "+student1+" average: "+average1);
		}
		else
		{
			System.out.println("Details of student who obtained higest Student: "+student3+" average: "+average3);
		}
	}
	else{
			if(average3>average2)
			{
				System.out.println("Details of student who obtained higest Student: "+student3+" average: "+average3);
			}
			else
			{
				System.out.println("Details of student who obtained higest Student: "+student2+" average: "+average2);
			}
	     }
	
	

}}


