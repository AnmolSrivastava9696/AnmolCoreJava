package Asssignments;

public class account
{
	
	    String accountname;
		int accountno;
		int accountbal;
		double int_rate;
		double int_amount;
		public String getDetails()
		{
			return ("Account Number: "+accountno+" Account Balance: "+accountbal+"Interest Rate"+int_rate);
		}
		public void depositAmount(float amt)
		{
			accountbal+=amt;
			System.out.println(accountname+" have successfully deposited an amount of "+amt);
		}
	public void calculateInterest()
	{
		int_amount=(accountbal*(int_rate/100));
		System.out.println("Interest amount for "+accountname+" will be "+int_amount);
		
	}
	public void checkBalance()
	{
		System.out.println("Available Balance for "+accountname+" is "+accountbal);
	}
	public void calculateAmount()
	{
		System.out.println("Final amount for "+accountname+"will be "+(accountbal+this.int_amount));
	}
	


}
