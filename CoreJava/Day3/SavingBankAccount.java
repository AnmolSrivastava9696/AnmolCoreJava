package Basics;

public class SavingBankAccount extends Account
{
public void depositAmount(float amt)
{
	accountbal+=amt;
	System.out.println("You have successfully deposited an amount of "+amt);
}
public void withdrawAmount(float amt)
{
	if(accountbal-amt>=500)
	{
		accountbal-=amt;
		System.out.println("You have successfully withdrawn "+amt+" from your account");
	}
	else
	{
		System.out.println("Transaction failed.You have to maintain a minimum balance of 500");
	}
}


}
