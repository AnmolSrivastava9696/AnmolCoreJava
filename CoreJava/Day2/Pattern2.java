package Basics;

public class Pattern2 
{
	public static void main(String args[])
	{
		for(int i=1;i<=3;i++)
		{
			for(int l=1;l<=3-i;l++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
