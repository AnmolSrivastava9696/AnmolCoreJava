package Basics;
//overloading example
public class OverloadngExample 
{
	public static int add(int x,int y)
	{
		return (x+y);
	}
	public static float add(float a,float b)
	{
		return (a+b);
	}
	public static int add(int x,int y,int z)
	{
		return(x+y+z);
	}
	public static double add(double a,double b,double c)
	{
		return (a+b+c);
	}
	public static float add(float a,float b,float c)
	{
		return (a+b+c);
	}
	
public static void main(String args[])
{
	System.out.println(add(2,3,4));
	System.out.println(add(2,23));
	System.out.println(add(2.23f,3.12f));
	System.out.println(add(2.23f,3.12f,54.9f));
}
}
