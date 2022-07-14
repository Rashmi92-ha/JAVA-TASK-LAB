import java.util.*;
import java.lang.*;
class ArmStrongNumber
{
public static void main(String main[])
{
	int num,digit=0,dummy1,dummy2,sum=0,rem;
	Scanner rk=new Scanner(System.in);
	System.out.println("Enter a number");
	num=rk.nextInt();
	dummy1=num;
	dummy2=num;
	while(num!=0)
	{
		num=num/10;
		digit++;
	}
	while(dummy1!=0)
	{
	rem=dummy1%10;
	sum+=Math.pow(rem,digit);
	dummy1=dummy1/10;
	}
	if(sum==dummy2)
	{
		System.out.println(dummy2+ "is a armstrong number");
	}
	else
	{
		System.out.println(dummy2+ "is not a armstrong number");
	}
}
}
