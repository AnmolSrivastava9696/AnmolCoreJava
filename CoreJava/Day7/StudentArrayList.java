package Basics;
import java.util.*;
public class StudentArrayList 
{
public static void main(String args[])
{
	ArrayList<StudentClass> students=new ArrayList<>();
	students.add(new StudentClass("Anmol",23,32,43));
	students.add(new StudentClass("Anant",007,16,04));
	students.add(new StudentClass("Shagun",69,69,69));
    for(StudentClass s:students)
	{
		
	s.displaydetails();

	
	}
	
}	


}
