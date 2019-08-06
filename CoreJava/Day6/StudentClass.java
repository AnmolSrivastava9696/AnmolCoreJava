package Basics;

public class StudentClass 
{
	String name;
	int id;
	double marks1;
	double marks2;
	
	public StudentClass(String name, int id, double marks1, double marks2) {
		super();
		this.name = name;
		this.id = id;
		this.marks1 = marks1;
		this.marks2 = marks2;
	}
	public double calculateAverage()
	{
		double avg=(marks1+marks2)/2;
		return avg;
	}
	public void displaydetails()
	{
		System.out.println("Name: "+name+" Marks in subject 1: "+marks1+" Marks in subject 2: "+marks2+" Average Marks "+this.calculateAverage());
	}

}

