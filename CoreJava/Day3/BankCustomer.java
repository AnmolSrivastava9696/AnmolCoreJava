package Basics;

public class BankCustomer 
{
	public static void main(String args[])
	{
		SavingBankAccount s=new SavingBankAccount();
		s.accountbal=1000;
		s.int_rate=6;
		s.accountno=1234;
		
		System.out.println(s.getDetails());
		System.out.println("Interest amount is "+s.calculateInterest());
		s.depositAmount(1000);
		s.withdrawAmount(500);
		System.out.println(s.getDetails());
		System.out.println("Interest amount is "+s.calculateInterest());
		
	}

}
