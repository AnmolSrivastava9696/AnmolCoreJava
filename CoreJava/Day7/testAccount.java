package Asssignments;

public class testAccount 
{
	public static void main(String args[])
	{
		savingBankAccount Ram=new savingBankAccount(123,0,4,"Ram");
		savingBankAccount Shyam=new savingBankAccount(124,0,4,"Shyam");
		Ram.depositAmount(25000);
		Shyam.depositAmount(35000);
		Ram.calculateInterest();
		Ram.calculateAmount();
		Shyam.calculateInterest();
		Shyam.calculateAmount();
		fixedDepositAccount Prashant =new fixedDepositAccount(125,0,6,"Prashant");
		Prashant.depositAmount(20000);
		Prashant.calculateInterest();
		Ram.checkBalance();
		Ram.withdrawAmount(1000);
		Ram.checkBalance();
		Ram.withdrawAmount(23600);
		
		
		
		
	}

}
