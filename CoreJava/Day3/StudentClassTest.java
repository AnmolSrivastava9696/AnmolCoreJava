package Basics;

public class StudentClassTest 
{
	public static void maximumAverage(StudentClass a,StudentClass b )
	{
		if((a.calculateAverage())>(b.calculateAverage()))
		{
			System.out.println(a.name+" has greater average ");
		}
		else
		
		{
			System.out.println(b.name+" has greater average");
		}
		}
public static void main(String args[])
{
	StudentClass student1=new StudentClass();
	student1.name="Anmol";
	student1.marks1=51;
	student1.marks2=60;
	student1.displaydetails();
	StudentClass student2=new StudentClass();
	student2.name="Shagun";
	student2.marks1=50;
	student2.marks2=60;
	student2.displaydetails();
	double avg1=student1.calculateAverage();
	double avg2=student2.calculateAverage();
	StudentClassTest.maximumAverage(student1,student2);
	
}
}
