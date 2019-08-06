package Asssignments;

public class arrayRotation 
{
public static int getGCD(int a,int b)
{
int i=1;
int result=1;
int n;
if(a<b)
{
	n=a;
}
else
{
n=b;	
}
while(i<=n)
{
	if(a%i==0&&b%i==0)
	{
		result =i;
	}
	i++;
}
return result;
}
public static void arrayRotate(int arr[],int d)
{
int length=arr.length;
int jump=getGCD(length,d);


}
public static void main(String args[])
{
System.out.println(getGCD(3,12));	

}
}
