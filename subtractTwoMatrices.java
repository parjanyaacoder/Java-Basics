import java.util.*;
public class subtractTwoMatrices {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i,j,m,n;
	System.out.println("Enter number of rows and columns in matrices");
	 m=sc.nextInt();
     n=sc.nextInt();
	System.out.println("Enter first matrix");
	int m1[][]=new int[m][n];
	int m2[][]=new int[m][n];
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			m1[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter second matrix");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			m2[i][j]=sc.nextInt();
		}
	}
	System.out.println("The difference of matrices is");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print((m1[i][j]-m2[i][j])+" ");
		}
		System.out.println("");
}
	
}}
