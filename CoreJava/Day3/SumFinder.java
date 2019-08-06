package Basics;

public class SumFinder
{
	public static void main(String args[])
	{
		int[] numbers={15,50,31,34,40,98,65,43,0,25};
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(numbers[i]+numbers[j]==65)
				{
					System.out.println(numbers[i]+"+"+numbers[j]+" =65 ");
				}
			}
		}
	}

}















































