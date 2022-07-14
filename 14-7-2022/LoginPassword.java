import java.util.Scanner;
class LoginPassword
{
public static void main(String args[])
{
	String username;
	int password;
	Scanner rk=new Scanner(System.in);
	System.out.print("Enter the username:");
	username=rk.nextLine();
	System.out.print("Enter the password:");
	password=rk.nextInt();
	System.out.println(password);
	{
		if(password==1234)
		{
		System.out.println(username+ "Login Succesfull:");
		}
		else
		{
		System.out.println(username+ "Login Denied:");
		}
	}
}
}

	