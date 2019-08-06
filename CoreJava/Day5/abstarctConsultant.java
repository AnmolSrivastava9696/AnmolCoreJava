package Basics;

public class abstarctConsultant extends abstractEmp
{
	static double rate_per_unit=80;
	double no_of_hours;
	
	public abstarctConsultant(double x,int empid)
	{
		super(empid);
		no_of_hours=x;
	}    
	@Override
	public void calculate_salary() 
	{
		// TODO Auto-generated method stub
		double total=(no_of_hours*(rate_per_unit));
		System.out.println(total);
		
	}

}
