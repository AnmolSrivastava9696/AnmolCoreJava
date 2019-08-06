package Basics;

public class Series2 
{
	public static void main(String args[])
	{
		int start=99;
		int i=1;
		int diff=17;
		int add=8;
		System.out.print(start+" ");
		while(i<9)
		{
			if(i%2==1)
			{
				start=start-diff;
				System.out.print(start+" ");
				diff=diff-1;
				i++;
			}
			if(i%2==0)
			{
				start=start+add;
				System.out.print(start+" ");
				add=add+1;
				i++;
			}
		}
		
	}

}
