import java.util.Scanner;
class StrongNumber
{
public static void main(String args[])
{
	int num,i,fact=1,sum=0,dummy,rem;
	Scanner rk=new Scanner(System.in);
	System.out.println("Enter the number:");
	num=rk.nextInt();
	dummy=num;
	while(num!=0)
	{
		rem=num%10;
		i=1;
		fact=1;
		while(i<=rem)
		{
			fact=fact*i;
			i++;
		}
		sum=sum+fact;
		num=num/10;
	}
	if(sum==dummy)
	{
		System.out.println(dummy+ "is a strong number:");
	}
	else
	{
		System.out.println(dummy+ "is not a strong number:");
	}
}
}