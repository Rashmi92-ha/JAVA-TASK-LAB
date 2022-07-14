import java.util.*;
class FindDigits
{
public static void main(String args[])
{
	int num,digit=0,dummy;
	Scanner rk=new Scanner(System.in);
	System.out.println("Enter the variable");
	num=rk.nextInt();
	dummy=num;
	while(num!=0)
	{
		num=num/10;
		digit++;
	}
	System.out.println("The number of digits in" +dummy+ "is" +digit);
}
}