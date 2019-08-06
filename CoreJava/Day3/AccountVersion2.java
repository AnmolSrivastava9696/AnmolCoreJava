package Basics;

public class AccountVersion2 
{

		int accountno;
		double accountbal;
		float int_rate;
		public AccountVersion2(int accountno)
		{
			this.accountno=accountno;
		}
		public AccountVersion2(int accountno,double accountbal)
		{
			this.accountno=accountno;
			this.accountbal=accountbal;
		}
		public AccountVersion2(int accountno,double accountbal,float int_rate)
		{
			this.accountno=accountno;
			this.accountbal=accountbal;
			this.int_rate=int_rate;
		}
		public String getDetails()
		{
			return ("Account Number: "+accountno+" Account Balance: "+accountbal+" Interest Rate :"+int_rate);
		}
	public double calculateInterest()
	{
		return (accountbal*(int_rate/100));
		
	}
}



