package Basics;

public class PolymrphismTestClass1 
{
public static void main(String args[])
{
	PolymorphismBaseClass b=new PolymorphismChildClass1();
	PolymorphismBaseClass c=new PolymorphismChildCLass2();
	System.out.println(b.getROI());
	System.out.println(c.getROI());
}
}
