package Basics;

public class abstract_FTE extends abstractEmp
{
	
   static double rate_per_unit=2400;
    double no_of_days;
	public abstract_FTE(double x,int empid)
	{
		super(empid);
		no_of_days=x;
	}    
	@Override
	public void calculate_salary() 
	{
		// TODO Auto-generated method stub
		double total=(no_of_days*(rate_per_unit));
		System.out.println(total);
		
	}

}
