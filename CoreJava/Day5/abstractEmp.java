package Basics;

public abstract class abstractEmp 
{

protected int emp_id;

public abstractEmp(int empid)
{
	// TODO Auto-generated constructor stub
	emp_id=empid;
	
}
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}

public abstract void calculate_salary();


}
