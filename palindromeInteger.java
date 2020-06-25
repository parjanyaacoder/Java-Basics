import java.util.*;
public class palindromeInteger {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,revNumber=0,temp;
	System.out.println("Enter an integer");
	n=sc.nextInt();
	temp=n;
	while(temp>0)
	{
		revNumber=revNumber*10+n%10;
		temp=temp/10;
	}
	if(n==revNumber)
		System.out.println("Palindrome integer");
	else
		System.out.println("Not a palindrome integer");
}
}
