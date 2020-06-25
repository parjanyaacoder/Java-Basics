import java.util.*;
public class largestElement {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i,n,k;
	System.out.println("Enter length of array");
	n=sc.nextInt();
	int arr[]=new int[n];
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	k=arr[0];
	for(i=1;i<n;i++)
	{
		if(arr[i]>k)
			k=arr[i];
	}
	System.out.println("Largest element is:"+k);
	
}
}
