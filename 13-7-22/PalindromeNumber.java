import java.util.Scanner;
class PalindromeNumber
{
public static void main(String args[])
{
	int num,sum=0;
	Scanner rk=new Scanner(System.in);
	System.out.println("Enter a Number:");
	num=rk.nextInt();
	int copy=num;
	while(num!=0)
	{
	int rem=num%10;
	sum=sum*10+rem;
	num=num/10;
	}
	if(sum==copy)
	{
	System.out.println(copy+"is a palindrome");
	}
	else
	{
	System.out.println(copy+"is not a palndrome");
	}
}
}