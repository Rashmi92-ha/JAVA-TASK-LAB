import java.util.Scanner;
class ReversePyramid{
public static void main(String args[])
{
	int lines,i,j;
	Scanner rk=new Scanner(System.in);
	System.out.println("Enter number of lines:");
	lines=rk.nextInt();
	for(i=1;i<=lines;i++)
	{
		for(j=lines;j>=i;j--)
		{
		System.out.print("+");
		}
			System.out.println("");
		}
}
}