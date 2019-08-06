package Basics;

public class abstractTest
{
public static void main(String args[])
{
	abstract_FTE afte=new abstract_FTE(4,12);
	abstarctConsultant ac=new abstarctConsultant(11,123);
	afte.calculate_salary();
	ac.calculate_salary();
}
}
