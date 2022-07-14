import java.util.Scanner;
class SumOfEven
{
public static void main(String args[])
{
	int num,i,sum=0;
	Scanner rk=new Scanner(System.in);
	System.out.println("Enter a number:");
	num=rk.nextInt();
	for(i=1;i<=num;i++)
	{
		if(i%2==0)
		{
			sum+=i;
		}
	}
	System.out.println("The sum of even numbers" +num+ "=" +sum);
}
}