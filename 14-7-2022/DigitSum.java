import java.util.Scanner;
class DigitSum{
public static void main(String args[])
{
	int num,digit,sum=0;
	Scanner rk=new Scanner(System.in);
	System.out.println("Enter the number");
	num=rk.nextInt();
	while(num>0)
	{
		digit=num%10;
		sum=sum+digit;
		num=num/10;
	}
	System.out.println("Sum of digits:"+sum);
}
}
