package Basics;

public class AddPrimeNumbers
{
	public static void addAndPrint(int n)
	{
		System.out.println("2");
		int counter,i=3,c;
	for(counter=2;counter<=n;i++)
	{
		for(c=2;c<i;c++)
		{
			if(i%c==0){break;}
			if(c==i)
			{
				System.out.println(i);
				
				counter++;
			}
		}
	}
	
	}
	public static void main(String args[])

	{
	addAndPrint(10);

	}
}
