package Basics;

public class Account
{
	int accountno;
	int accountbal;
	float int_rate;
	public String getDetails()
	{
		return ("Account Number: "+accountno+" Account Balance: "+accountbal+" Interest Rate :"+int_rate);
	}
public float calculateInterest()
{
	return (accountbal*(int_rate/100));
	
}
}
