import java.util.*;
public class first5 {
	
	static boolean isPrime(int n)
	{   int c=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				c++;
			
		}
		if(c==0)
			return true;
		else
		return false;
	}
	
	
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i=1,j=2,c=5;
	while(i<=5)
	{
		if(isPrime(j))
		{   i++;
			System.out.println(j);
		}
		j++;
	}
	
}
}
