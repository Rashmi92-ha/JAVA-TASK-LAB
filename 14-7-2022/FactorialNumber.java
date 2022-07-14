import java.util.*;
class FactorialNumber
{
public static void main(String args[])
{
	int fact=1,num,i;
	Scanner rk=new Scanner(System.in);
	System.out.println("Enter the number to print its factorial:");
	num=rk.nextInt();
	for(i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial of" +num+ "is:" +fact);
}
}
