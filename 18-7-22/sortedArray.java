import java.util.*;
class sortedArray{
public static void main(String args[])
{
Scanner rk=new Scanner(System.in);
System.out.println("Enter length of array");
int len=rk.nextInt();
int arr[]=new int[len];int temp=0;
System.out.println("Enter the array elements");
	for(int i=0;i<len;i++){
	arr[i]=rk.nextInt();
	}
for(int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			if(arr[i]>arr[j])
			{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
	}
		System.out.println("Sorted Array is ");
		for(int n:arr){
		System.out.print(n+"");
}
}
}	
	
