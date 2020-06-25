import java.util.*;
public class palindromeString {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String str1,str2="";
	System.out.println("Enter a string");
	str1=sc.nextLine().trim();
	int i=str1.length()-1;
	while(i>=0)
	{
		str2=str2+str1.charAt(i);
		i--;
	}
	if(str2.equals(str1))
		System.out.println("Palindrome string");
	else
		System.out.println("Not a palindrome string");
}
}
