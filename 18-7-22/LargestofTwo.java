import java.util.Scanner;
public class LargestofTwo{

public static void main(String args[])
{
	Scanner ck=new Scanner(System.in);
	System.out.print("Enter First value:");
	int firstNumber=ck.nextInt();
	System.out.print("Enter Second value:");
	int secondNumber=ck.nextInt();
	if(firstNumber>secondNumber)
	{
		System.out.println(firstNumber+" is largest");
	}
	else{
		System.out.println(secondNumber+" is largest");
	}
	}
	}