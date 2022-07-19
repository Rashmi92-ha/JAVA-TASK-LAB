import java.util.*;
class DuplicateArray{
public static void main(String args[])
{
	int i,j,count=0;
	Scanner rk=new Scanner(System.in);
	System.out.println("Enter length of an array");
	int len=rk.nextInt();
	int arr[]=new int[len];
	System.out.println("Enter the array elements");
	for(i=0;i<len;i++)
	arr[i]=rk.nextInt();
	for(i=0;i<len;i++)
	{
		for(j=0;j<len;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
			}	
		}
	}
	System.out.println("Array is:");
	for(int n:arr)
	System.out.print(n+" ");
	{
	System.out.println("Number of duplicates in an above array is" +count);
	}
}
}
