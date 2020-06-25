import java.util.Scanner;
public class reverseArray {
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
	System.out.println("Array in reverse order is:");
	for(i=arr.length-1;i>=0;i--)
		System.out.print(arr[i]+" ");
}
}
