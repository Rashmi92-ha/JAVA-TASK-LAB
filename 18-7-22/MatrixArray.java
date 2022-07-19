import java.util.*;
class MatrixArray{
public static void main(String args[])
{
	int i,j;
	Scanner rk=new Scanner(System.in);
	System.out.println("Enter number of row");
	int rows=rk.nextInt();
	System.out.println("Enter number of cols");
	int cols=rk.nextInt();
	int ar[][]=new int[rows][cols];
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
			ar[i][j]=rk.nextInt();
		}
	}
for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
System.out.print(ar[i][j] + " ");
}
System.out.println(" ");
}
}
}