import java.util.*;
class FindPositionElem
{
public static void main(String args[])
{
	Scanner rk=new Scanner(System.in);
	System.out.println("Enter the length of an array");
	int len=rk.nextInt();
	int arr[]=new int[len];int count=0;
	System.out.println("Enter the array elements:");
	for(int i=0;i<len;i++)
	{
	arr[i]=rk.nextInt();
	}
	System.out.println("Enter elements to find its position");
	int elem=rk.nextInt();
	for(int i=0;i<len;i++)
	{
		if(arr[i]==elem)
		{
			System.out.println(elem+"found at" +i);
		}
	}
}
}