import java.util.Scanner;
class PrintLeapYear
{
	public static void main(String args[])
	{
	int startyear,endyear,i;
	Scanner rk=new Scanner(System.in);
	System.out.println("Enter the starting year:");
	startyear=rk.nextInt();
	System.out.println("Enter the end year:");
	endyear=rk.nextInt();
	System.out.println("Leap years:");
		for(i=startyear;i<=endyear;i++)
		{
			if(i%4==0)
		System.out.println(i);
		}
}
}