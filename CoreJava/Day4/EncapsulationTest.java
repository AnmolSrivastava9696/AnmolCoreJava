package Basics;

public class EncapsulationTest 
{
	public static void main(String args[])
	{
		Encapsulation e=new Encapsulation();
		e.setAccount_no(1234);
		e.setAcc_bal(500);
		System.out.println(e.getAcc_bal());
		System.out.println(e.getAccount_no());
	}

}
