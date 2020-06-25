import java.util.*;
public class primeNumber {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i,c=0,n;
	System.out.println("Enter a number");
	n=sc.nextInt();
	for(i=2;i<=n/2;i++)
	{
		if(n%i==0)
			c++;
		
	}
	if(c==0)
		System.out.println("Prime Number");
	else
		System.out.println("Not a Prime Number");
}
}
