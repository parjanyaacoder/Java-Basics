import java.util.*;
public class swap {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b=sc.nextLine();
	String c=a+b;
	a=c.substring(a.length());
	b=c.substring(0,a.length());
	System.out.println(a);
	System.out.println(b);
}
}
