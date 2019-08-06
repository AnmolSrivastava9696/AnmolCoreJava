package Basics;

public class WordsCounting 
{
	
public static void main(String args[])
{
	int count=1;
	String a= "I  am  anmol  srivastava";
	char[] array=a.toCharArray();

	if(array.length==0)
	{
		System.out.println("No words entered");
	}
	for(int j=0;j<array.length;j++)
	{
		if(array[j]==' '&&(j+1)<a.length())
		{
			count++;
		}
		if(array[j]==' '&&array[j+1]==' ')
		{
			j=j+1;
		}
		
	}
	if(array.length!=0)
	System.out.println(count);
	}
}
