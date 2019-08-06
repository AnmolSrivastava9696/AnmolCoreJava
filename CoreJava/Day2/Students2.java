package Basics;

public class Students2 
{
	public static void main(String args[])
	{
		int sum=0;
		int[] marks=new int[5];
		marks[0]=72;
		marks[1]=79;
		marks[2]=81;
		marks[3]=69;
		marks[4]=96;
		for(int i=0;i<5;i++)
		{
			sum=sum+marks[i];
		}
		int average=sum/5;
		for(int i=0;i<5;i++)
		{
			if(marks[i]>average)
			{
				System.out.print(marks[i]);
			}
		}
	}

}
