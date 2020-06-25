import java.util.*;
public class copyArray {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i,n;
	System.out.println("Enter length of array");
	n=sc.nextInt();
	int arr[]=new int[n];
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int brr[]=new int[n];
	for(i=0;i<n;i++)
	{
		brr[i]=arr[i];
	}
	System.out.println("Array 1 is:");
	for(i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Array 2 is:");
	for(i=0;i<n;i++)
	{
		System.out.print(brr[i]+" ");
	}
}
}
