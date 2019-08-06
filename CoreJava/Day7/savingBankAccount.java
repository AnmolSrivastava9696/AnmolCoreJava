package Asssignments;

public class savingBankAccount extends account
{
	public savingBankAccount(int accountno,int accountbal,double int_rate,String accountname)
	{
		this.accountname=accountname;
		this.accountno=accountno;
		this.accountbal=accountbal;
		this.int_rate=int_rate;
	}
	
	public void withdrawAmount(float amt)
	{
		if(accountbal-amt>=500)
		{
			accountbal-=amt;
			System.out.println(accountname+" have successfully withdrawn "+amt+" from your account");
		}
		else
		{
			System.out.println("Transaction failed."+accountname+" have to maintain a minimum balance of 500");
		}
	}

}
