import java.util.Scanner;
class Reversenumber{
public static void main(String args[])
{
	int num,rem,sum=0;
	Scanner rk=new Scanner(System.in);
	System.out.println("Enter the number");
	num=rk.nextInt();

	while(num!=0)
	{
	rem=num%10;
	sum=sum*10+rem;
	num=num/10;
	}
	System.out.println("Reverse number is:" +sum);
}
}